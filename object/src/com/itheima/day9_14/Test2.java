package com.itheima.day9_14;

import java.util.concurrent.ArrayBlockingQueue;

public class Test2 {
    public static volatile int a = 0 ;
    public static void main(String[] args) {

        ArrayBlockingQueue<String> bd = new ArrayBlockingQueue<>(1);

        Food1 f = new Food1(bd);
        Food2 c = new Food2(bd);

        f.start();
        c.start();
    }
}
