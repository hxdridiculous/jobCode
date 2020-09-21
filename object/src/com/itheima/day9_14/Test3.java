package com.itheima.day9_14;

import java.util.Random;

public class Test3 {
    public static volatile int a =0;
    public static Object lock;
    public  static void main(String[] args) {
        Random rm = new Random();
        new Thread(()->{
                while (true){
                    synchronized (Test3.class) {
                        if (Test3.a >= 30) {
                            try {
                                Test3.class.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                            int b = rm.nextInt(30 - a)+1;
                            try {
                                Thread.sleep(100);
                                a+=b;
                                System.out.println("上来了" + b + "人，" + "车上还有" + a);
                                Test3.class.notify();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                    }
                }

        }).start();
        new Thread(()->{
            while (true){
                synchronized (Test3.class) {
                    if (a <= 0) {
                        try {
                            Test3.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                        int b = rm.nextInt(a)+1;
                        try {
                            Thread.sleep(100);
                            a -= b;
                            System.out.println("下来了" + b + "人，" + "车上还有" + (a + b));
                            Test3.class.notify();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                }
            }
        }).start();
   }
}
