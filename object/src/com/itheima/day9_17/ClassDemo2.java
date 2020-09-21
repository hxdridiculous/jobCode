package com.itheima.day9_17;

public class ClassDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class类中的静态方法forName("全类名")
        //全类名：包名+类名
        Class aClass = Class.forName("com.itheima.day9_17.Student");
        System.out.println(aClass);
        //通过class属性来获取
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);
        //利用对象的getClass来获取class对象
        //getClass方法是定义在Object类中
        Student student = new Student();
        Class aClass1 = student.getClass();
        System.out.println(aClass1);

        //对比是否相同
        System.out.println(aClass==studentClass);
        System.out.println(aClass1==studentClass);
    }
}
