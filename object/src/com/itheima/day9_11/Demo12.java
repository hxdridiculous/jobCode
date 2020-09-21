package com.itheima.day9_11;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo12 {
    /***
     * 将下列文件中的学生信息按照年龄升序排序后重新写回原文件;
     * **要求:**
     * 1:使用字符缓冲流完成;
     * 2:每次循环读取一行信息
     * 3:写数据的时候换行使用newLine方法;
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("object\\src\\com\\itheima\\day9_11\\1.txt"));
        String lan;
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result=o1.getAge()-o2.getAge();
                return result;
            }
        });
        while ((lan= br.readLine())!=null){
            String[] split = lan.split(",");
            Student student = new Student(split[0],Integer.parseInt(split[1]));
            ts.add(student);
        }
        br.close();
        BufferedWriter bfw = new BufferedWriter(new FileWriter("object\\src\\com\\itheima\\day9_11\\1.txt"));
        for (Student t : ts) {
            bfw.write(t.getName()+","+t.getAge());
            bfw.newLine();
            bfw.flush();
        }
        bfw.close();

    }
}
