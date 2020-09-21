package com.itheima.day9_17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //mathod();
        //mathod2();
        //mathod3();
        //mathod4();
    }

    private static void mathod4() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        Object o = aClass.newInstance();
        System.out.println(o);
    }

    private static void mathod3() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //私有构造
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object o = constructor.newInstance("你好");
        System.out.println(o);
    }

    private static void mathod2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //有参构造
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
        Object newInstance = constructor.newInstance("你好", 18);
        System.out.println(newInstance);
    }

    private static void mathod() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //无参构造
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();
        System.out.println(o.toString());
    }
}
