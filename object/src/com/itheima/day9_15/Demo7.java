package com.itheima.day9_15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo7 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int a;
        while ((a= is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,a));
        }
        String s = "看看我执行了吗？";
        OutputStream os = accept.getOutputStream();
        os.write(s.getBytes());
        os.write("你是人吗？".getBytes());
        os.flush();
        os.close();
        is.close();
        accept.close();
        ss.close();
    }
}
