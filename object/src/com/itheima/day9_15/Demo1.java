package com.itheima.day9_15;

import java.io.IOException;
import java.net.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*DatagramSocket datagramSocket = new DatagramSocket();
        String s = "送给村长老丈人的礼物";
        byte[] bytes = s.getBytes();
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        int port = 10000;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, byName, port);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();*/
        //传输数据的协议
        while (true) {
            DatagramSocket datagramSocket1 = new DatagramSocket();
            //传输的内容
            String s = "送一根华子";
            //传输的内容转成字节
            byte[] bytes = s.getBytes();
            //传输地方的地址
            InetAddress byName =InetAddress.getByName("255.255.255.255");
            //传输地方的端口
            int port = 10000;
            //所有东西打包
            DatagramPacket dp= new DatagramPacket(bytes ,bytes.length,byName,port);
            //传输所有东西
            datagramSocket1.send(dp);
            //结束传输
            datagramSocket1.close();
        }
    }
}
