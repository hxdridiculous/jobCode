package com.itheima.day9_14;

public class Demo4 {
    //bb
    public static void main(String[] args) {
        MyAtomThread myAtomThread = new MyAtomThread();
        for (int i = 0; i < 100; i++) {
            new Thread(myAtomThread).start();
        }
    }
}
