package com.itheima.day9_13;

public class Test3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(super.getName()+"线程开始了"+i);
        }
    }
}
