package com.itheima.Test7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(2201, 2, 12, 22, 2, 22, 22);
        //设定格式
        DateTimeFormatter patt = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        //进行格式化   输出格式化结果
        System.out.println(of.format(patt));
        //定义String类型时间
        String s = "2020年11月11日 00:00:11";
        System.out.println(s);
        LocalDateTime parse = LocalDateTime.parse(s,patt);
        System.out.println(parse);
    }
}
