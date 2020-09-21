package com.itheima.day9_13;

import java.io.*;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object\\src\\com\\itheima\\day9_13\\1.txt"));
        Student student1 = new Student("xiaohu", 18);
        Student student2 = new Student("xiaohu", 18);
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        oos.writeObject(list);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object\\src\\com\\itheima\\day9_13\\1.txt"));
        ArrayList<Student> o = (ArrayList<Student>)ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
