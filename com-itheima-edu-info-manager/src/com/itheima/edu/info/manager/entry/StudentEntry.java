package com.itheima.edu.info.manager.entry;

import java.util.Scanner;

import com.itheima.edu.info.manager.controller.StudentController;
import com.itheima.edu.info.manager.controller.TeacherController;
import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Teacher;

public class StudentEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //主菜单搭建
        io:while (true){
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生信息管理系统  2.老师信息管理系统  3.退出");
            String a = sc.next();
            switch (a){
                case "1":
                    StudentController.start();
                    System.out.println("学生信息管理系统");
                    break;
                case "2":
                    TeacherController. start();
                    System.out.println("老师信息管理系统");
                    break;
                case "3":
                    System.out.println("退出");
                    //退出正在运行的虚拟机
                    System.exit(0);
                    break ;
                default:
                    System.out.println("输入有误，重新输入" );
                    break;
            }
        }
    }
}
