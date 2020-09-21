package com.itheima.day9_15.Demo3;

import java.io.*;
import java.net.Socket;

public class SocketDemoTCP {
    public static void main(String[] args) throws IOException {

            /*Socket socket = new Socket("127.0.0.1",10001);
            OutputStream os = socket.getOutputStream();
            os.write("HELLO".getBytes());
            os.close();
            socket.close();*/
        /*OutputStream os = socket.getOutputStream();
        os.write("你好呀萨非经典回顾i算哈佛i".getBytes());*/
        //建立一个Socket  要去建立服务器
        //InputStream is = socket.getInputStream();
        /*byte[] bytes = new byte[1024];
        int a;
        while ((a=is.read(bytes))!=-1){
            System.out.print(new String(bytes,0,a));
        }*/
        Socket socket = new Socket("127.0.0.1", 10002);
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bfw.write("你好");
        bfw.flush();
        socket.shutdownOutput();
        //
        BufferedReader bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bfr.readLine();
        System.out.println(s);
        bfw.close();
        bfr.close();
        ///
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter( socket.getOutputStream());
        BufferedWriter bfw2 = new BufferedWriter(outputStreamWriter);
        bfw.write("我收到了你传过来的东西2");
        bfw2.flush();
        bfw2.close();

        socket.close();

    }

}
