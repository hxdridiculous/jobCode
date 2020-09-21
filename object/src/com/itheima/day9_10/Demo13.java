package com.itheima.day9_10;

import java.io.*;
import java.util.TreeSet;

public class Demo13 {
    public static void main(String[] args) throws IOException {
        File  f = new File("object\\src\\com\\itheima\\day9_10\\1.txt");
        FileInputStream inputStream = new FileInputStream(f);
        byte[] arr = new byte[(int)f.length()];
        inputStream.read(arr);
        String s =new String(arr);
        String[] split = s.split("\r\n");
        TreeSet<Student> set = new TreeSet<>((s1,s2)->s1.getAge()-s2.getAge()==0?s1.getName().compareTo(s2.getName()):s1.getAge()-s2.getAge());
        for (String s1 : split) {
            String[] split1 = s1.split(",");
            Student stu = new Student(split1[0],Integer.parseInt(split1[1]));
            set.add(stu);
        }
        File  f1 = new File("object\\src\\com\\itheima\\day9_10\\2.txt");
        FileOutputStream fout = new FileOutputStream(f1);
        for (Student student : set) {
            fout.write((student.toString()+"\r\n").getBytes());

        }
        inputStream.close();
        fout.close();
        System.out.println("排序已完成");
    }
}
