package com.itheima.day9_14;

import com.itheima.day8_29.Text2;

import java.util.concurrent.ArrayBlockingQueue;

public class Food1 extends  Thread{
    private final ArrayBlockingQueue<String> bd;

    public Food1(ArrayBlockingQueue<String> bd) {
        this.bd = bd;
    }

    @Override
    public void run() {

        while (true){
            if (Test2.a%2==0){
                System.out.println("第一条线程是打印偶数"+Test2.a);
                Test2.a++;
            }else {

            }
        }
    }
}
