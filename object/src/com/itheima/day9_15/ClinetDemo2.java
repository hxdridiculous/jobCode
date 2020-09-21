package com.itheima.day9_15;

import java.io.IOException;
import java.net.*;

public class ClinetDemo2 {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket();
        String s = "送给村长老丈人的礼物";
        byte[] bytes = s.getBytes();
        InetAddress byName = InetAddress.getByName("224.0.1.0");
        int port = 10000;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, byName, port);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}

