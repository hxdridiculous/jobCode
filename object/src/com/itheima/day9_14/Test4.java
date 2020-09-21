package com.itheima.day9_14;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Test4 extends Thread {
    Random rm = new Random();



    @Override
    public void run() {
        while (true){
            synchronized (Test5.class) {
                if (Test3.a == 30) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                } else {
                    int b = rm.nextInt(30 - Test3.a) + 1;
                    System.out.println("上来了" + b + "人，" + "车上还有" + (Test3.a + b));
                    Test3.a -= b;
                    this.notify();
                }
            }
        }
    }
}
