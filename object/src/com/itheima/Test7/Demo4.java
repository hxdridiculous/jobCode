package com.itheima.Test7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Demo4 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2010,1,1);
        LocalDate localDate1 = LocalDate.of(2020,2,10);
        /***
         * 获取两个时间相差的数值
         */
        Period period = Period.between(localDate, localDate1);
        System.out.println(period);
        //年
        System.out.println(period.getYears());
        //月
        System.out.println(period.getMonths());
        //日
        System.out.println(period.getDays());
        //总月
        System.out.println(period.toTotalMonths());
        //
        System.out.println(period.toString());
        /***
         * 获取两个时间的秒数
         */
        LocalDateTime localDate2 = LocalDateTime.of(2010,1,1,12,11,12);
        LocalDateTime localDate3 = LocalDateTime.of(2021,6,7,22,13,56);
        Duration between2 = Duration.between(localDate2, localDate3);
        System.out.println(between2);
        //间隔日
        System.out.println(between2.toDays());
        //间隔秒
        System.out.println(between2.toSeconds());
        //间隔毫秒
        System.out.println(between2.toMillis());
        //间隔纳秒
        System.out.println(between2.toNanos());
    }
}
