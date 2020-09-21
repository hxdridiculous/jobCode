package com.itheima.day9_15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10002);
        OutputStream os = socket.getOutputStream();
        os.write("你好".getBytes());
        os.flush();
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        InputStreamReader isr  = new InputStreamReader(inputStream);
        int a ;
        while ((a=isr.read())!=-1){
            System.out.print((char)a);
        }
        os.close();
        isr.close();
        socket.close();
    }
}
