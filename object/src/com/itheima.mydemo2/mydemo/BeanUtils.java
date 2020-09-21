package com.itheima.mydemo2.mydemo;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {
    private static Map<String, Object> map = new HashMap<>();

    static {

        //com.itheima.mydemo2.mydemo.bean
        File file = new File("C:\\Practise\\jobCode\\object\\src\\com\\itheima.mydemo2\\mydemo\\bean");
        File[] files = file.listFiles();
        for (File f : files) {
            try {
                String name = f.getName();
                String path = "com.itheima.mydemo2.mydemo.bean.";
                String[] split = name.split("\\.");
                path += split[0];
                Class<?> aClass = Class.forName(path);
                if (aClass.isAnnotationPresent(Bean.class)) {
                    Bean annotation = aClass.getAnnotation(Bean.class);
                    String value = annotation.value();
                    Object o = aClass.getConstructor().newInstance();
                    map.put(value, o);
                }


            } catch (ClassNotFoundException | NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } finally {
            }
        }
    }

    private BeanUtils() {
    }

    public static Object getBean(String s) {
        return map.get(s);
    }
}
