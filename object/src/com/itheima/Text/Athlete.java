package com.itheima.Text;

public class Athlete extends Person {


    @Override
    public void eat() {
        System.out.println("编号为:"+getId()+"的"+getAge()+"岁的"+getSex()+"教练"+getName()+"正在吃工作餐");

    }

    public Athlete(String id, String name, char sex, int age) {
        super(id, name, sex, age);
    }

    public Athlete() {
    }
}
