package com.itheima.Test6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        /***
         * 请从控制台分别接收两个“生日”，格式为：yyyy年MM月dd日，用程序比较两个生日表示的人的年龄大小关系并打印出结果;
         *
         * 要求:
         *
         * 1:使用Date+SimpleDateFormat完成一遍,
         */
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入生日：格式为：yyyy年MM月dd日");
        String one = sc.next();
        System.out.println("请输入生日：格式为：yyyy年MM月dd日");
        String two = sc.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        long time1 = simpleDateFormat.parse(one).getTime();
        long time2 = simpleDateFormat.parse(two).getTime();
        if (time1>time2){
            System.out.println("第一个年龄大");
        }else if(time1<time2){
            System.out.println("第二个年龄大");
        }else {
            System.out.println("年龄相同");
        }

    }
}
