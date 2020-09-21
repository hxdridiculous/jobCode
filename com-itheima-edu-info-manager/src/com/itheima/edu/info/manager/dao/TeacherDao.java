package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    static  Teacher[] teas = new Teacher[5];
    static {
        Teacher tea1 = new Teacher("1","张老师","29","1989-07-20");
        Teacher tea2 = new Teacher("2","李老师","33","1989-07-17");
        teas[0]=tea1;
        teas[1]=tea2;
    }
    public static  Teacher[] addTeacher() {
        return teas;
    }

    public static Boolean deleteTeacher(String id) {
        boolean a=false;
        for (int i = 0; i < teas.length; i++) {
            if (teas[i]!=null&&teas[i].getId().equals(id)){
                teas[i]=null;
                a=true;
            }
        }
        return a;
    }

    public static Teacher[] queryTeacher() {
        return teas;
    }
    public static Teacher[] setTeacher() {
        return teas;
    }
}
