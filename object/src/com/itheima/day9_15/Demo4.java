package com.itheima.day9_15;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10001);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\hxdri\\Desktop\\老罗.md"));
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        byte[] bytes  =new byte[1024];
        int b;
        while ((b= bis.read(bytes))!=-1){
            bos.write(bytes,0,b);
        }
        bos.flush();
        socket.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());
        bis.close();
        socket.close();
    }
}
