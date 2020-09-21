package com.itheima.day9_14;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie2 extends Thread{
    private ArrayBlockingQueue<String> bd ;

    public Foodie2(ArrayBlockingQueue bd) {
        this.bd = bd;
    }

    @Override
    public void run() {
        while (true) {
            try {
                bd.put("汉堡包");
                Thread.sleep(50);
                System.out.println("---做汉堡包");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
