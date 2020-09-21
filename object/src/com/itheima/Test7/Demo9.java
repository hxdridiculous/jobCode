package com.itheima.Test7;

import java.time.LocalDate;
import java.time.Period;

public class Demo9 {
    public static void main(String[] args) {
        String s = "1998-07-17";
        String[] s1 = s.split("-");
        int year = Integer.valueOf(s1[0]);
        int mo = Integer.valueOf(s1[1]);
        int day = Integer.valueOf(s1[2]);
        LocalDate date = LocalDate.of(year, mo, day);
        LocalDate now = LocalDate.now();
        Period period = Period.between(date, now);
        System.out.println("您已经活了：" + period.getYears() + "年" + period.getMonths() + "月" + period.getYears() + "日");
    }
}
