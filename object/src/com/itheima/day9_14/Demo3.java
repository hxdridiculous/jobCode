package com.itheima.day9_14;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo3 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool  = new ThreadPoolExecutor(2, 5, 2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("你好");
            }
        });
        for (int i = 0 ; i<=20;i++) {
            int finalI = i;
            pool.submit(()->{ System.out.println(Thread.currentThread().getName()+"中午"+ finalI); });
        }
        pool.shutdown();
    }
}
