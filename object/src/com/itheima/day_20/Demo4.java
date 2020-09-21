package com.itheima.day_20;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo4 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.itheima.day_20.Demo3");
        Object o = aClass.newInstance();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(Test.class)){
                method.invoke(o);
            }
        }
        boolean annotationPresent = aClass.isAnnotationPresent(Test.class);
        System.out.println(annotationPresent);
    }
}
