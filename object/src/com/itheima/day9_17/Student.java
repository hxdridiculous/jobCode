package com.itheima.day9_17;

public class Student {
    private String name;
    private int age;
    public String name1;
    public int age1;
    private static int abc (){
        System.out.println("niaho1");
        return 13;
    }
    public static void abcd (){
        System.out.println("niaho1");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
        System.out.println("无参构造");
    }

    private  Student(String name){
        System.out.println("私有构造"+name);
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private static int see(String name,int age){
        System.out.println("有参有返回值方法名字是"+name);
        return age;
    }
}
