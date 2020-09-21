package com.itheima.Test3;

public class UILecturer extends Staff implements Drawing{
    public UILecturer() {
    }

    public UILecturer(String gender, String name, int age) {
        super(gender, name, age);
    }

    @Override
    public void work() {
        System.out.print(getAge()+"岁的"+getGender()+"老师"+getName()+"正在说");
    }

    @Override
    public void drawing() {
        System.out.println("画画");
    }
}
