package com.itheima.day9_17;

import java.lang.reflect.Field;

public class DemoClass5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-----------------------------");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-----------------------------");
        Field field = aClass.getField("name2");
        /*Student student = (Student) aClass.newInstance();
        field.set(student,"zhangsan");
        System.out.println(student);*/
        System.out.println("-----------------------------");




        //获取name这个Filed对象
        Field name = aClass.getDeclaredField("name");
        //创建一个Student对象
        Student student = (Student) aClass.newInstance();
        //取消一下访问检查
        name.setAccessible(true);
        //利用set进行赋值Student对象
        name.set(student,"zhangsan");
        //利用get进行获取Student对象的值
        Object o1 = name.get(student);
        System.out.println(o1);
        System.out.println(student);
        System.out.println("-----------------------------");
    }
}
