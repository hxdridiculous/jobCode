package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    // 创建StudentDao (库管)
    private StudentDao studentDao = new StudentDao();

    // 添加学生方法
    public boolean addStudent(Student stu) {
        // 2. 将学生对象, 传递给StudentDao 库管中的addStudent方法
        // 3. 将返回的boolean类型结果, 返还给StudentController
        return studentDao.addStudent(stu);
    }

    //判断空
    public boolean isExists(String id) {
        return studentDao.findAllStudengt(id);

    }
    //删除模块
    public boolean delete(String id) {
        return  studentDao.deleteStudengt(id);
    }
    //查看模块
    public Student[] queryStudent() {
        // 1. 调用库管对象的queryStudent获取学生对象数组
        return studentDao.queryStudent();


    }
    //修改学生信息
    public int set(String id) {
        return studentDao.set(id);

    }
    //替换原来位置学生信息
    public void setaddStudent(Student stu, int flag) {
        studentDao.setStudent(stu,flag);

    }
}
