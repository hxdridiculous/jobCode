package com.itheima.day9_19;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis= new BufferedInputStream(new FileInputStream("object\\a.txt"));
        Socket socket = new Socket("127.0.0.1",10001);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        int a ;
        while ((a=bis.read(bytes))!=-1){
            bos.write(bytes,0,a);
        }
        bos.flush();
        socket.shutdownOutput();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String b = "";
        while ((b = bfr.readLine())!=null){
            System.out.println(b);
        }
        bis.close();
        socket.close();

    }
}
