package com.itheima.Test3;

public abstract class Staff {
    private String gender;
    private String name;
    private int age;

    public abstract void work();

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public Staff() {
    }

    public Staff(String gender, String name, int age) {
        this.gender = gender;
        this.name = name;

        this.age = age;
    }
}
