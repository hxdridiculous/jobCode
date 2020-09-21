package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        io:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String a = sc.next();
            switch (a) {
                case "1":
                    addStudent();
                    //System.out.println("添加学生");
                    break;
                case "2":
                    deleteStudent();
                    //System.out.println("删除学生");
                    break;
                case "3":
                    setStudengt();
                   //System.out.println("修改学生");
                    break;
                case "4":
                    queryStudent();
                    //System.out.println("查看学生");
                    break;
                case "5":
                    System.out.println("退出");
                    break io;
                default:
                    System.out.println("输入有误，重新输入");
                    break;
            }
        }

    }
    //修改
    private static void setStudengt() {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入要修改学生的学号");
            id = sc.next();
            int flag = studentService.set(id);
            if (flag==-1) {
                System.out.println("将要修改的学号不存在");
            } else {
                Student stu = getStudent(sc,  id);
                studentService.setaddStudent(stu,flag);
                break;
            }
        }
    }

    private static void queryStudent() {
        StudentService studentService = new StudentService();
        Student[] stus = studentService.queryStudent();
        if (stus == null) {
            System.out.println("查无信息, 请添加后重试");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }
    }


    //删除学生信息
    private static void deleteStudent() {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true){
            System.out.println("请输入要删除学生的学号");
            id = sc.next();
            boolean flag = studentService.delete(id);
            if (flag){
                System.out.println("删除成功");
                break;
            }else {
                System.out.println("没有相同的学号");
            }
        }
    }


    public static void addStudent() {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true){
            System.out.println("请输入学号");
             id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag){
                System.out.println("学号占用");
            }else {
                break;
            }
        }
        Student stu = getStudent(sc, id);
        boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    private static Student getStudent(Scanner sc, String id) {
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生出生日期");
        String birthday = sc.next();
        return new Student(id, name, age, birthday);
    }
}
