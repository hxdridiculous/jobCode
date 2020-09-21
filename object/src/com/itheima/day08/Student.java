package com.itheima.day08;

import java.util.Set;

public class Student implements Comparable<Student> {
    private String name;
    private int english;
    private int chinese;
    private int math;

    public Student(String name, int english, int chinese, int math) {
        this.name = name;
        this.english = english;
        this.chinese = chinese;
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", english=" + english +
                ", chinese=" + chinese +
                ", math=" + math +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public Student(String s, int i) {
    }

    private int getNum() {
        return this.chinese+this.english+this.math;
    }

    @Override
    public int compareTo(Student o) {
        int i =   this.getNum()-o.getNum();
        return i;
    }




    /*@Override
    public int compareTo(Student o) {
        int result = this.age-o.age;
        result = result==0?this.name.compareTo(o.getName()):result;
        return result;
    }*/
}
