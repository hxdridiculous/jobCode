package com.itheima.Test7;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Student student = new Student();
        student.setName(name);
        while (true) {
            String agesr = sc.nextLine();
            try {
                int age = Integer.parseInt(agesr);
                student.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入整数");
                continue;
            } catch (RuntimeException e) {
                System.out.println("18-25之内的年龄");
                continue;
            }
        }
        System.out.println(student);
    }
}
