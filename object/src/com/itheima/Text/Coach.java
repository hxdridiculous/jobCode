package com.itheima.Text;

public class Coach extends Person {


    private String className;

    @Override
    public void eat() {
        System.out.println("编号为:" + getId() + "的" + getAge() + "岁的" + className + "班的" + getSex() + "同学" + getName() + "正在吃营养餐");

    }

    public Coach(String id, String name, char sex, int age, String className) {
        super(id, name, sex, age);
        this.className = className;
    }

    public Coach(String className) {
        this.className = className;
    }

}