package com.itheima.day9_14;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> bd = new ArrayBlockingQueue<>(1);
        Cooker2 cooker2 = new Cooker2(bd);
        Foodie2 foodie2 = new Foodie2(bd);
        cooker2.start();
        foodie2.start();

    }
}