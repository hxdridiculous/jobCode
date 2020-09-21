package com.itheima.utils;

public class TestBean {
    public static void main(String[] args) {
        Object student =  BeanUtils.getBean("student");
        /*student.setName("老张");
        student.setAge(18);*/
        System.out.println(student);
    }
}
