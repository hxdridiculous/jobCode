package com.itheima.Test3;

public class Test1 {
    public static void main(String[] args) {
        Lecturer lecturer =new Lecturer("男","王老师",22);
        lecturer.work();
        UILecturer UILecturer =new UILecturer("女","李老师",21);
        UILecturer.work();
        UILecturer.drawing();
    }
}
