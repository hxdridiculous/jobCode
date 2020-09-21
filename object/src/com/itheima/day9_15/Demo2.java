package com.itheima.day9_15;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        //从6000端口接受数据
        while (true) {
            System.out.println("我是一条分割线（前）----------------");
            DatagramSocket datagramSocket = new DatagramSocket(10000);
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket);
            int length = datagramPacket.getLength();
            System.out.println(new String(bytes,0,length));
            System.out.println("我是一条分割线（后）----------------");
            datagramSocket.close();
        }

    }
}
