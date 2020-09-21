package com.itheima.day9_19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        //请实现一个工具类, 里面定义可以获取ArrayList和LinkedList集合的最大值,最小值的方法,并体会多态的好处
        ArrayList<Integer> arrayListlist = new ArrayList();
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < 10; i++) {
            arrayListlist.add((int)(Math.random()*100));
            linkedList.add((int)(Math.random()*100));
        }
        System.out.println(arrayListlist);
        System.out.println(linkedList);
        int max = getMax(arrayListlist);
        System.out.println(max);
        int min = getMin(linkedList);
        System.out.println(min);
    }

    private static int getMax(List<Integer> list) {
        int max = list.get(0);
        for (Integer integer : list) {
            if ( max < integer)max=integer;
        }
        return max;
    }
    private static int getMin(List<Integer> list) {
        int min = list.get(0);
        for (Integer integer : list) {
            if ( min > integer)min=integer;
        }
        return min;
    }
}
