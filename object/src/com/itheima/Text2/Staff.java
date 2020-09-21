package com.itheima.Text2;

public class Staff extends AD {
    private  int id;
    private String name;
    private int age;

    public Staff() {
    }

    public Staff(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public void content() {
        System.out.println(id+"  "+name+"  "+age+"    "+",我发通知了...");
    }


}
