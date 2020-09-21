package com.itheima.day9_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cave implements Runnable {

    private static int sulest= 0;
    @Override
    public void run() {
        synchronizedtest();
    }

    private static synchronized void synchronizedtest() {
        System.out.println(Thread.currentThread().getName()+"通过山洞，他是第"+(sulest+1)+"个");
        sulest++;
    }

}
