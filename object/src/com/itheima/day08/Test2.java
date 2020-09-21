package com.itheima.day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        /***
         * /***
         *          * 请定义一个Collection类型的集合，存储以下分数信息：
         *          * 88.5,39.2,77.1,56.8,89.0,99.0,59.5
         *          *
         *          * **要求:**
         *          *
         *          * 请编程实现以下功能：
         *          * 使用增强for遍历所有元素，并打印
         *          * 使用增强for遍历所有元素，打印不及格的分数；
         *          * 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
         *          * 使用增强for遍历所有元素，求出最高分，并打印；
         *
         */

        Collection<Double> list = new ArrayList<>();
        list.add(88.5);
        list.add(39.2);
        list.add(77.1);
        list.add(56.8);
        list.add(89.0);
        list.add(99.0);
        list.add(59.5);
        System.out.println("所有元素：");
        for (Double aDouble : list) {
            System.out.print(aDouble);
        }
        System.out.println("------------------------");
        System.out.println("打印不及格的分数:");
        for (Double aDouble : list) {
            if (aDouble<60){
                System.out.println(aDouble);
            }
        }
        System.out.println("打印不及格的分数:");
        int a=0;
        double b=0;
        for (Double aDouble : list) {
            if (aDouble<60){
                a++;
            }
            b+=aDouble;
        }
        System.out.println("不及格的数量："+a);
        System.out.println("平均分："+b/list.size());
        double max = 0;
        for (Double aDouble : list) {
            if (max<aDouble){
                max=aDouble;
            }
        }
        System.out.println("最高分为："+max);
    }
}
