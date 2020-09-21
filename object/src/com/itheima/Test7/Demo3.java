package com.itheima.Test7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo3 {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(2201, 2, 12, 22, 2, 22, 22);
        //添加一年
        LocalDateTime localDateTime = of.plusYears(1);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        String format = localDateTime.format(pattern);
        System.out.println(format);
        //减少一年
        LocalDateTime localDateTime1 = of.minusYears(1);
        String format1 = localDateTime1.format(pattern);
        System.out.println(format1);
        //修改年为1998
        LocalDateTime localDateTime2 = of.withYear(1998);
        String format2 = localDateTime2.format(pattern);
        System.out.println(format2);
    }
}
