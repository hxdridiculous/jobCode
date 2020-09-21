package com.itheima.day9_17;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> list = new ArrayList<>();
        Method constructor = list.getClass().getMethod("add", Object.class);
        constructor.invoke(list,123);
        System.out.println(list);
    }
}
