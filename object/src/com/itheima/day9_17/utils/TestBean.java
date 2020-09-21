package com.itheima.day9_17.utils;

public class TestBean {
    public static void main(String[] args) {
        Student student = (Student) BenUtils.getBean("student");
        student.setName("老张");
        student.setAge(18);
        System.out.println(student);
    }
}
