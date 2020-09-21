package com.itheima.day9_14;

import java.util.concurrent.locks.ReentrantLock;


public class Tset1 {
    public static int number = 1;

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Object lock = new Object();
        new Thread(() ->  {
            while (true) {
                synchronized (lock) {
                    lock.notify();
                    if (number % 2 == 1) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("第1条线程打印偶数:" + number);
                        number++;
                        if (number == 101) {
                            break;
                        }
                    }
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    lock.notify();
                    if (number % 2 == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("第2条线程打印偶数:" + number);
                        number++;
                        if (number == 100) {
                            break;
                        }
                    }
                }
            }
        }).start();
    }
}
