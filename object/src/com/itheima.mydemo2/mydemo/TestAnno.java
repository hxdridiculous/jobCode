package com.itheima.mydemo2.mydemo;

import com.itheima.day9_17.utils.BenUtils;

public class TestAnno {
    public static void main(String[] args) throws ClassNotFoundException {
        Object stu = BeanUtils.getBean("stu");
        System.out.println(stu);
    }
}
