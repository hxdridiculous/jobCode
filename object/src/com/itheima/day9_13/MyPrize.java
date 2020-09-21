package com.itheima.day9_13;

import java.util.ArrayList;

public class MyPrize extends Thread{
    private static ArrayList<String> list= new ArrayList<>();
    private static int i =0;

    public static ArrayList<String> getList() {
        return list;
    }

    public static void setList(ArrayList<String> list) {
        MyPrize.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (MyMusic.class){
                    try {
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName()+"抽到了：\t"+list.get(i));
                        i++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }catch (IndexOutOfBoundsException e){
                        break;
                    }
            }
        }
    }
}
