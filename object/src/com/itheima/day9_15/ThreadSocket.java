package com.itheima.day9_15;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket implements Runnable{

    private final Socket accept;

    public ThreadSocket(Socket accept) {
        this.accept = accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
        try {
            InputStream inputStream = accept.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(inputStream);
             bos  = new BufferedOutputStream(new FileOutputStream("object\\src\\com\\itheima\\day9_15\\laoluo"+ UUID.randomUUID().toString().replace("-","") +".md"));
            byte[] bytes = new byte[1024];
            int a;
            while ((a=bis.read(bytes))!=-1){
                bos.write(bytes,0,a);
            }
            bos.flush();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos!=null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept!=null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
