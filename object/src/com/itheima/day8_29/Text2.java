package com.itheima.day8_29;

public abstract class Text2 {
    public static void main(String[] args) {
        final int a =10;
        //值不能更改
//        a=20;
        //名字大写

        final int MAX =290;
        final  int MAX_VALUE=20;
        //地址不能更改
        final  Studennt stu = new Studennt();
        stu.setName("t78twgd");
        stu.setName("trewd");
//        stu=new Studennt();

    }

}
class Studennt{
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Studennt(String name) {
        this.name = name;
    }

    public Studennt() {
    }
}