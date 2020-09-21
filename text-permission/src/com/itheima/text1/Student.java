package com.itheima.text1;

public class Student extends Person{
    private int score;

    public Student() {

    }

    public Student(String name,int age,int score) {
        super(name,age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
