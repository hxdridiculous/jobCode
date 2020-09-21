package com.itheima.Test6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws ParseException {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第1个生日:(yyyy年MM月dd日)");
            String t1 = sc.next();
            System.out.println("请输入第2个生日:(yyyy年MM月dd日)");
            String t2 = sc.next();
            //方式1:
            /*SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日");
            Date d1 = s.parse(t1);
            Date d2 = s.parse(t2);
            if(d1.getTime()>d2.getTime()){
                System.out.println("第1个生日的人年龄更小一些");
            }else if(d1.getTime()<d2.getTime()){
                System.out.println("第2个生日的人年龄更小一些");
            }else {
                System.out.println("两个生日的人年龄相同!");
            }*/
            //方式2
            //获取格式化工具
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
            //解析两个日期字符串
            LocalDate d1 = LocalDate.parse(t1, df);
            LocalDate d2 = LocalDate.parse(t2, df);
            if(d1.isAfter(d2)){
                System.out.println("第1个生日的人年龄更小一些");
            }else if(d2.isAfter(d1)){
                System.out.println("第2个生日的人年龄更小一些");
            }else {
                System.out.println("两个生日的人年龄相同!");
            }


    }

}
