package com.itheima.day9_17;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class ClassDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("com.itheima.day9_17.Student");
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("-----------------------------");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("-----------------------------");
        Constructor constructor = aClass.getConstructor(String.class,int.class);
        System.out.println(constructor);
        System.out.println("-----------------------------");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        System.out.println(declaredConstructor);
        System.out.println("-----------------------------");
    }
}
