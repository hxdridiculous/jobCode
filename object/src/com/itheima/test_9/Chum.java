package com.itheima.test_9;

import java.util.Objects;

public class Chum {
    private String name;
    private int age;

    public Chum() {
    }

    public Chum(String name, int age) {
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

    @Override
    public String toString() {
        return "Chum{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chum chum = (Chum) o;
        return age == chum.age &&
                Objects.equals(name, chum.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
