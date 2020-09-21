package com.itheima.day9_19;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);
        while (true) {
            Socket accept = ss.accept();
            ThreadSocket threadSocket = new ThreadSocket(accept);
            new  Thread(threadSocket).start();

        }
        //ss.close();
    }
}
