package com.itheima.day9_13;

public class MyTread extends Thread {
    private static int a = 100;

    @Override
    public void run() {
        while (true) {
            if (maipiao()) {
                break;
            }
        }
    }
    private  synchronized boolean maipiao() {
        if (a <= 0) {
            return true;
        } else {
           /* try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            a--;
            System.out.println(Thread.currentThread().getName() + "正在卖票,还剩" + a + "张");
        }
        return false;
    }
}
