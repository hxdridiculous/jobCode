package com.itheima.day9_15;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        System.out.println("我是一条分割线（前）----------------");
        MulticastSocket datagramSocket = new MulticastSocket(10000);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        datagramSocket.joinGroup(InetAddress.getByName("224.0.1.0"));
        datagramSocket.receive(datagramPacket);
        int length = datagramPacket.getLength();
        System.out.println(new String(bytes,0,length));
        System.out.println("我是一条分割线（后）----------------");
        datagramSocket.close();
    }
}
