package com.itheima.day9_13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyRnnable mr = new MyRnnable();
        Thread thread = new Thread(mr);
        thread.setName("张三");
        thread.start();
        Mycallable mycallable = new Mycallable();
        FutureTask<String> futureTask = new FutureTask<>(mycallable);
        Thread thread1 = new Thread(futureTask);
        thread1.start();
        String s = futureTask.get();
        System.out.println(s);
    }
}
