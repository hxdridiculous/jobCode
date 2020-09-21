package com.itheima.day9_19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        //使用冒泡排序对ArrayList和LinkedList进行排序
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int)(Math.random()*100));
            linkedList.add((int)(Math.random()*100));
        }

        System.out.println(arrayList);
        System.out.println(linkedList);

        BubbleSort(arrayList);
        BubbleSort(linkedList);

        System.out.println(arrayList);
        System.out.println(linkedList);
    }

    public static void BubbleSort(List<Integer> list){
        int[] arr = new int[list.toArray().length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        BubbleSort(arr);
        for (int i = 0; i < list.size(); i++) {
            list.set(i,arr[i]);
        }
    }

    //使用数组来冒泡.[使用集合直接操作也是可以的].
    public static void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j+1]<arr[j]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
}
