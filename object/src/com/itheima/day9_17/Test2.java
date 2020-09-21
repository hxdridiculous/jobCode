package com.itheima.day9_17;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws Exception {
        //获取字节码对象的三种方式.
        //getByte();
        //获取构造方法对象的方式.然后使用构造方法创建对象.
        //getConstructors();
        //获取成员变量对象的方式.然后使用成员变量对象调用set和get方法测试.
        //getVarible();
        //获取方法对象的方式.然后调用invoke()方法测试.
        //getMathod();

    }

    private static void getMathod() throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        Object o = aClass.getConstructor().newInstance();
        //调用指定公共的方法
        Method abcd = aClass.getMethod("abcd");
        abcd.invoke(o);
        //调用所有公共的方法
        Method[] methods = aClass.getMethods();
        //调用所有私有的方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        //调用指定私有的方法
        Method abc = aClass.getDeclaredMethod("abc");
        abc.setAccessible(true);
        Object invoke = abc.invoke(o);
        System.out.println(invoke);
    }

    private static void getVarible() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        //获取单个公共的成员变量
        Field name1 = aClass.getField("name1");
        //获取全部公共的成员变量
        Field[] fields = aClass.getFields();
        //获取单个私有的成员变量
        Field name = aClass.getDeclaredField("name");
        Object o = aClass.getConstructor().newInstance();
        name.setAccessible(true);
        name.set(o,"张三");
        name.get(o);
        System.out.println(name);
        //获取全部私有的成员变量
        Field[] declaredFields = aClass.getDeclaredFields();
    }

    private static void getConstructors() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        Constructor<?> constructor1 = aClass.getConstructor();
        //创建对象
        constructor1.newInstance();
        //获取单个公共空参构造
        Constructor<?> constructor = aClass.getConstructor();
        //获取全部个公共空参构造
        Constructor<?>[] constructors = aClass.getConstructors();
        //取消一下访问检查
        constructor.setAccessible(true);
        //获取单个私有构造
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        //创建对象
        declaredConstructor.newInstance();
        //取消一下访问检查
        constructor.setAccessible(true);
        //获取全部构造
        Annotation[] declaredAnnotations = aClass.getDeclaredAnnotations();
    }

    private static void getByte() throws ClassNotFoundException {
        //获取字节码方式---1
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        //获取字节码方式---2
        Class<Student> studentClass = Student.class;
        //获取字节码方式---3
        Student student = new Student();
        Class<? extends Student> aClass1 = student.getClass();
    }
}
