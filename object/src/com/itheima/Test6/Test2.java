package com.itheima.Test6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat Gs = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String aa =Gs.format(date);
        System.out.println(aa);
    }
}
