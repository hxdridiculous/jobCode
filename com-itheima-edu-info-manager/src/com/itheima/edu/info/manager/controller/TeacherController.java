package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.StudentService;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        io:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    addTeacher();
                    //System.out.println("添加老师");
                    break;
                case 2:
                    deleteTeacher();
                    //System.out.println("删除老师");
                    break;
                case 3:
                    setTeacher();
                    //System.out.println("修改老师");
                    break;
                case 4:
                    queryTeacher();
                    //System.out.println("查看老师");
                    break;
                case 5:
                    System.out.println("退出");
                    break io;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }

    }

    //查看老师
    private static void queryTeacher() {
        TeacherService steacherService = new TeacherService();
        Teacher[] teas = steacherService.queryTeacher();
        if (teas == null) {
            System.out.println("暂无信息，请添加后重试");
        } else {
            System.out.println("学号\t\t姓名\t年龄\t生日");
            for (int i = 0; i < teas.length; i++) {
                if (teas[i] != null) {
                    Teacher tea = teas[i];
                    System.out.println(tea.getId() + "\t" + tea.getName() + "\t" + tea.getAge() + "\t\t" + tea.getBirthday());
                }
            }
        }
    }

    //添加老师
    private static void addTeacher() {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入教师编号");
            id = sc.next();
            boolean flag = TeacherService.isExists(id);
            if (flag) {
                break;
            } else {
                System.out.println("教师编号重复，请重新输入");
            }
        }
        System.out.println("请输入教师姓名");
        String name = sc.next();
        System.out.println("请输入教师年龄");
        String age = sc.next();
        System.out.println("请输入教师生日");
        String birthday = sc.next();
        Teacher tea = new Teacher(id, name, age, birthday);
        boolean flag = TeacherService.addTeacher(tea);
        if (flag) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }


    }

    //删除老师
    private static void deleteTeacher() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要删除教师的编号");
            String id = sc.next();
            Boolean flog = TeacherService.deleteTeacher(id);
            if (flog) {
                System.out.println("删除成功");
                break;
            } else {
                System.out.println("没有查到相同的教书编号，请重新输入");
            }
        }

    }

    //修改老师
    private static void setTeacher() {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        String id;
        int flag=-1;
        while (true) {
            System.out.println("请输入要修改的教师编号");
            id = sc.next();
            flag = TeacherService.setTeacher(id);
            if (flag == -1) {
                System.out.println("教师编号重复，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入教师姓名");
        String name = sc.next();
        System.out.println("请输入教师年龄");
        String age = sc.next();
        System.out.println("请输入教师生日");
        String birthday = sc.next();
        Teacher tea = new Teacher(id, name, age, birthday);
        TeacherService.addTeacherTwo(tea, flag);
        System.out.println("修改成功");
        }

}





