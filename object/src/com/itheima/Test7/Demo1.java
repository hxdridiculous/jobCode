package com.itheima.Test7;

import java.time.LocalDateTime;

public class Demo1 {
    public static void main(String[] args) {
        String s = "2020年11月11日 00:00:00";
        //空参构造   获取当前时间
        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);
        //年
        System.out.println("年是："+localDateTime.getYear());
        //月
        System.out.println("月是："+localDateTime.getMonthValue());
        //日
        System.out.println("日是："+localDateTime.getDayOfMonth());
        //一年的第几天
        System.out.println("一年的第几天"+localDateTime.getDayOfYear()+"天");
        //星期为
        System.out.println("星期为："+localDateTime.getDayOfWeek());
        //分钟为
        System.out.println("分钟为："+localDateTime.getMinute());
        //小时为
        System.out.println("小时为："+localDateTime.getHour());
        //有参构造
        LocalDateTime of = LocalDateTime.of(2200, 11, 11, 1, 1, 1);
        //获取datetime里面的年月日
        System.out.println(of.toLocalDate());
        //获取datetime里面的时分秒
        System.out.println(of.toLocalTime());
    }
}
