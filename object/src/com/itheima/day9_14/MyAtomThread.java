package com.itheima.day9_14;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomThread implements Runnable {
    AtomicInteger ai = new AtomicInteger();
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int a = ai.incrementAndGet();
            System.out.println(Thread.currentThread().getName()+"执行"+a);
        }
    }
}
