package com.itheima.day9_15;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemoTCP {
    public static void main(String[] args) throws IOException {
       /* ServerSocket ss  = new ServerSocket(10001);
            Socket accpt  = ss.accept();
            InputStream inputStream = accpt.getInputStream();
            int a ;
            while ((a = inputStream.read())!=-1){
                System.out.print((char)a);
            }
            ss.close();
            inputStream.close();*/
        ServerSocket ss = new ServerSocket(10002);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int a;
        while ((a=is.read(bytes))!=-1){
            System.out.print(new String(bytes,0,a));
        }
        ss.close();
        is.close();

    }

}
