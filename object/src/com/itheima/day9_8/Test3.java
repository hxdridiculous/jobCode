package com.itheima.day9_8;

import java.util.ArrayList;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(11)+10);
        }
        list.stream().filter(integer -> integer>15).forEach(integer -> System.out.println("  "+integer));
    }
}
