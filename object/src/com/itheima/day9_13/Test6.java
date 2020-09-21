package com.itheima.day9_13;

public class Test6 {
    public static void main(String[] args) {
        MyTread myTread = new MyTread();
        MyTread myTread2 = new MyTread();
        MyTread myTread3 = new MyTread();
        myTread.start();
        myTread2.start();
        myTread3.start();
//        Thread thread1 = new Thread(myTread,"老王");
//        Thread thread2 = new Thread(myTread2,"老李");
//        Thread thread3 = new Thread(myTread3,"老张");
//        thread1.start();
//        thread2.start();
//        thread3.start();
    }
}
