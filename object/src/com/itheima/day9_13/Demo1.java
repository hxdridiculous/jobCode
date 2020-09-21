package com.itheima.day9_13;

public class Demo1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("播放音乐。。。");
                }
            }
        }).start();
        new Thread(()->{
            while (true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("显示画面。。。");
            }
        }).start();
    }
}
