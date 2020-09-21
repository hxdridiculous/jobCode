package com.itheima.day9_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        ArrayList<Student> stulist = new ArrayList<>();
        ArrayList<String> slist = new ArrayList<>();

            Student student1 = new Student("张三",19);
            Student student2 = new Student("李四",29);
            Student student3 = new Student("张四",31);

            stulist.add(student1);
            stulist.add(student2);
            stulist.add(student3);
            slist.add("北京");
            slist.add("上海");
            slist.add("广州");



       /* for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"个学生姓名");
            String s = sc.next();
            System.out.println("请输入第"+(i+1)+"个学生年龄");
            int a = sc.nextInt();
            student.setName(s);
            student.setAge(a);
            stulist.add(student);
        }*/
        /*for (int i =0; i<3;i++) {
            System.out.println("请输入第"+(i+1)+"个居住地信息");
            String s1 = sc.next();
            slist.add(s1);
        }*/
        TreeMap<Student, String> treemap = new TreeMap<>((s1,s2)->s2.getAge()-s1.getAge());
        for (int i = 0; i < stulist.size(); i++) {
            Student key = stulist.get(i);
            String value = slist.get(i);
            treemap.put(key,value);
        }
        treemap.entrySet().stream().filter(s->s.getKey().getName().startsWith("张")).forEach(s-> System.out.println("学生信息:"+s.getKey()+",对应的居住地是:"+s.getValue()));



    }
}
