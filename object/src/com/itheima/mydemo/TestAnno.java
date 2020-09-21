package com.itheima.mydemo;

public class TestAnno {
    public static void main(String[] args) throws ClassNotFoundException {

        Object car = BeanUtils.getBean("stu");
        System.out.println(car);

    }
}
