package com.itheima.day9_14;

import java.util.concurrent.ArrayBlockingQueue;

public class Food2 extends Thread{

    private final ArrayBlockingQueue<String> bd;

    public Food2(ArrayBlockingQueue<String> bd) {
        this.bd = bd;
    }

    @Override
    public void run() {

    }
}
