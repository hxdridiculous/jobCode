package com.itheima.day9_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyMusic implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = simpleDateFormat.format(date);
            System.out.println(s);
        }
    }

}
