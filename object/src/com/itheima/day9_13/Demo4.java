package com.itheima.day9_13;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("电视机");
        list.add("电冰箱");
        list.add("电脑");
        list.add("游戏机");
        list.add("洗衣机");
        list.add("空调");
        list.add("手机");
        list.add("平板电脑");
        list.add("电动车");
        list.add("电饭煲");
        MyPrize mp = new MyPrize();
        mp.setList(list);
        Thread thread1 = new Thread(mp, "张三");
        thread1.start();
        Thread thread2 = new Thread(mp, "李四");
        thread2.start();
        Thread thread3 = new Thread(mp, "王五");
        thread3.start();
    }
}
