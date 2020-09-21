package com.itheima.day9_15.Demo3;

import java.io.*;
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
        /*InputStream is = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int a;
        while ((a=is.read(bytes))!=-1){
            System.out.print(new String(bytes,0,a));
        }
        OutputStream os = accept.getOutputStream();
        os.write("我收到了你传过来的东西".getBytes());*/
        //OutputStream outputStream = accept.getOutputStream();
        ServerSocket ss = new ServerSocket(10002);
        Socket accept = ss.accept();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String s = bfr.readLine();
        System.out.println(s);
        //

        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter( accept.getOutputStream()));
        bfw.write("我收到了你传过来的东西");
        accept.shutdownOutput();
        bfw.flush();
        bfr.close();
        //

        BufferedReader bfr1 = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String s2 = bfr.readLine();
        System.out.println(s2);
        bfr1.close();

        bfw.close();
        accept.close();
        ss.close();

    }

}
