package com.itheima.mydemo;

import com.itheima.mydemo.bean.Car;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {
    private static  Map<String,Object> map = new HashMap<>();
    static {
        //解析bean文件件下所有的类.谁身上有bean注解.谁就应该存入map集合.
        File file = new File("object\\src\\com\\itheima\\mydemo\\bean");
        File[] files = file.listFiles();
        for (File f : files) {
            try {
                System.out.println(f);
                String name = f.getName();
                String path = "com.itheima.mydemo.bean.";
                String[] split = name.split("\\.");
                path = path+split[0];//com.itheima.mydemo.bean.Car
                Class<?> aClass = Class.forName(path);
                if(aClass.isAnnotationPresent(Bean.class)){
                    Bean annotation = aClass.getAnnotation(Bean.class);
                    String key = annotation.value();
                    Object obj = aClass.getConstructor().newInstance();
                    map.put(key, obj);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    //私有构造
    private BeanUtils(){}

    //提供公开的访问方法
    public static Object getBean(String name){
        return map.get(name);
    }


}
