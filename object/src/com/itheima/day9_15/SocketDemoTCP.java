package com.itheima.day9_15;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDemoTCP {
    public static void main(String[] args) throws IOException {

            /*Socket socket = new Socket("127.0.0.1",10001);
            OutputStream os = socket.getOutputStream();
            os.write("HELLO".getBytes());
            os.close();
            socket.close();*/
        //建立一个Socket  要去建立服务器
        Socket socket = new Socket("127.0.0.1", 10002);
        OutputStream os = socket.getOutputStream();

        os.write("你好呀萨非经典回顾i算哈佛i".getBytes());
        os.close();
        socket.close();

    }

}
