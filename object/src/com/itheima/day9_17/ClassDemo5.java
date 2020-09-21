package com.itheima.day9_17;

import java.lang.reflect.Method;

public class ClassDemo5 {
    public static void main(String[] args) throws Exception {
        //获取Class对象
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        //获取里面的Mathod方法
        Method method = aClass.getDeclaredMethod("see", String.class, int.class);
        //取消一下访问检查
        method.setAccessible(true);
        //获取一下Student对象，当做方法的调用者
        Student student = (Student) aClass.getConstructor().newInstance();
        //运行方法
        int invoke = (int) method.invoke(student, "小胡", 16);
        //打印
        System.out.println(invoke);
    }
}
