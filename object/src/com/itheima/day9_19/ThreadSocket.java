package com.itheima.day9_19;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket  implements Runnable{
    private final Socket accept;

    public ThreadSocket(Socket accept) {
        this.accept=accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos =null;
        try {
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            bos=new BufferedOutputStream(new FileOutputStream("object"+ UUID.randomUUID().toString().replace("-","")+".txt"));
            byte[] bytes = new byte[1024];
            int b;
            while ((b=bis.read(bytes))!=-1){
                bos.write(bytes,0,b);
            }
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bfw.write("成功");
            bfw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept!=null){

                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
