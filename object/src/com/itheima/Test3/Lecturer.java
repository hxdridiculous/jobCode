package com.itheima.Test3;

import com.itheima.Test3.Staff;

public class Lecturer extends Staff {

    public Lecturer() {
    }

    public Lecturer(String gender, String name, int age) {
        super(gender, name, age);
    }

    @Override
    public void work() {
        System.out.println(getAge()+"岁的"+getGender()+"老师"+getName()+"正在讲java接口和抽象类...");
    }
}
