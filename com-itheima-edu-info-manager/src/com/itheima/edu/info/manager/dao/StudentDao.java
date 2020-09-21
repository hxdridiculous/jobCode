package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {

    static Student[] stus = new Student[5];
    static {
        Student stu1 = new Student("1","张三","19","1999-07-20");
        Student stu2 = new Student("2","李四","23","1999-07-17");
        stus[0]=stu1;
        stus[1]=stu2;
    }
    //增删改查
    public boolean addStudent(Student stu) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            stus[index] = stu;

            return true;
        }

    }
    public boolean findAllStudengt(String id){
        boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && student.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;

    }

    public Student[] queryStudent(){
        // 2. 判断数组中是否有学生信息 (有: 返回地址,  没有: 返回null)
        // 思路: 数组中只要存在一个不是null的元素, 那就代表有学生信息
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null){
                flag = true;
                break;
            }
        }
        if(flag){
            // 有信息
            return stus;
        }else{
            // 没有信息
            return null;
        }
    }
    public void setStudent(Student stu, int flag){
        stus[flag]=stu;
    }

    public boolean deleteStudengt(String id) {
        //默认不相同
        boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && student.getId().equals(id)) {
                stus[i]=null;
                //删除相同的
                exists = true;
                break;
            }
        }
//        返回false 没有所所输入的学号
        return exists;
    }

    public int set(String id) {
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && student.getId().equals(id)) {
                return i;
            }
        }
//        返回false 木有所所输入的学号
        return -1;
    }
}
