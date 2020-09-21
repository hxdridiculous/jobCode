package com.itheima.day9_14;

import java.util.Random;

public class Test5 extends Thread {
    Random rm = new Random();



    @Override
    public void run() {
        while (true){
            synchronized (Test5.class) {
                if (Test3.a == 0) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                } else {
                    int b = rm.nextInt(Test3.a);
                    System.out.println("下来了" + b + "人，" + "车上还有" + (Test3.a + b));
                    Test3.a -= b;
                    this.notify();
                }
            }
        }
    }
}
