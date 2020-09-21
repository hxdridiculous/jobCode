package com.itheima.day9_13;

import com.itheima.day8_29.Text3;

public class Test4 {
    public static void main(String[] args) {
        //创建一个线程对象
        Test3 test3 = new Test3();
        test3.setName("老王");
        //创建一个线程对象
        Test3 test4 = new Test3();
        test4.setName("小王吧");
        //开启第一条线程
        test3.start();
        //开启第一条线程
        test4.start();
    }
}
