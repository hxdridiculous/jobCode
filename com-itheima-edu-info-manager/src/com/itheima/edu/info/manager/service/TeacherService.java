package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    public static  boolean addTeacher(Teacher tea) {
         Teacher[] teas = TeacherDao.addTeacher();
         boolean a= false;
        for (int i = 0; i < teas.length; i++) {
            if (teas[i]==null){
                teas[i]=tea;
                a= true;
                break;
            }
        }
        return a;
    }

    public static boolean isExists(String id) {
        Teacher[] teas = TeacherDao.addTeacher();
        boolean a= true;
        for (int i = 0; i < teas.length; i++) {
            if (teas[i]!=null &&id.equals(teas[i].getId())){
                a= false;
                break;
            }
        }
        return a;
    }
    public static int setTeacher(String id) {
        Teacher[] teas = TeacherDao.addTeacher();
        int a= -1;
        for (int i = 0; i < teas.length; i++) {
            if (teas[i]!=null && id.equals(teas[i].getId())){
                a = i;
                break;
            }
        }
        return a;
    }

    public static Boolean deleteTeacher(String id) {
        return TeacherDao.deleteTeacher(id);
    }

    public static void addTeacherTwo(Teacher tea, int flag) {
        Teacher[] teas = TeacherDao.setTeacher();
        teas[flag]=tea;
    }

    public Teacher[] queryTeacher() {
        Teacher[] teas = TeacherDao.queryTeacher();
        boolean flag =false;
        for (int i = 0; i < teas.length; i++) {
            if (teas[i]!=null){
                flag=true;
            }
        }
        if (flag){
            return teas;
        }else {
            teas=null;
            return teas;
        }
    }
}
