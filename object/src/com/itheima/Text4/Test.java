package com.itheima.Text4;

public class Test {
    public static void main(String[] args) {
        double a=-11;
        System.out.println(a+"绝对值:"+Math.abs(a));
        a= 10.1;
        System.out.println(a+"向下取整:"+Math.ceil(a));
        a=10.9;
        System.out.println(a+"向上取整:"+Math.floor(a));
        a=10.4;
        System.out.println(a+"四舍五入：:"+Math.round(a));
        int b = 30 ,c= 40;
        System.out.println(b+"和"+c+"最大值：:"+Math.max(b,c));
        System.out.println(b+"和"+c+"最小值：:"+Math.min(b,c));
        System.out.println(b+"的"+c+"次幂结果：:"+Math.pow(2,0.5));
        for (int i= 0;i<10;i++) {
            System.out.println("随机数"+Math.random());
        }
        long l = System.currentTimeMillis();
        String e= "";
        for (int i = 0; i < 1000000; i++) {
            e+=i;
        }
        System.out.println(e);
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l);
    }
}
