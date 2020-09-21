package com.itheima.Text4;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /***
         * 在一行中通过键盘输入自己的年龄和身高(要带小数),
         * 年龄和身高中间使用逗号分隔,请利用今天的技术和字符串的切分方法,
         * 将键盘输入的数据转成整数和小数;
         */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] c =a.split(",");
        String d = c[0];
        String e = c[1];
        int f =Integer.parseInt(d);
        System.out.println(f);
        System.out.println(Double.parseDouble(e));
    }
}
