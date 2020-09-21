package com.itheima.day9_14;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker2 extends Thread{
    private ArrayBlockingQueue<String> bd ;

    public Cooker2(ArrayBlockingQueue bd) {
        this.bd = bd;
    }

    @Override
    public void run() {

        while (true) {
            try {
                String take = bd.take();
                Thread.sleep(50);
                System.out.println("===吃"+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
