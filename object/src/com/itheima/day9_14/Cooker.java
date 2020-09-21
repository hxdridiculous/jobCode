package com.itheima.day9_14;

public class Cooker extends Thread {

    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }else {
                    if (Desk.flag) {
                        System.out.println("吃包子");
                        Desk.flag=false;
                        Desk.count--;
                        Desk.lock.notifyAll();
                    }else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }
    }
}
