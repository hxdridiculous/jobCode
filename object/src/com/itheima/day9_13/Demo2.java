package com.itheima.day9_13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo2 {
    public static void main(String[] args) {
        MyMusic myMusic = new MyMusic();
        Thread thread = new Thread(myMusic);
        thread.start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LocalDateTime localDateTime =LocalDateTime.now();
                DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String s = localDateTime.format(pattern);
                System.out.println("------"+s);
            }
        }).start();
    }
}
