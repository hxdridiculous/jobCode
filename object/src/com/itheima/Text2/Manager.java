package com.itheima.Text2;

public class Manager extends AD{

    private  int id;
    private String name;
    private int age;
    private int money;

    public Manager() {
    }

    public Manager(int id, String name, int age, int money) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.money = money;
    }

    @Override
    public void content() {
        System.out.println(id+"  "+name+"  "+age+"    "+money+",我发通知了...");
    }
}
