package com.itheima.utils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 可以跟据配置文件来动态的创建对象.
 * 整个项目中你都可以找这个工具类来要对象.自己不需要new对象.
 */
public class BeanUtils {

    private static Map<String,Object> beans = new HashMap();

    //静态代码块只会执行一次.在类加载的时候执行.
    static{
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("prop.properties");
            Properties properties = new Properties();
            properties.load(is);
            Set<Map.Entry<Object, Object>> entries = properties.entrySet();
            for (Map.Entry<Object, Object> entry : entries) {
                String classPath = (String) entry.getValue();
                Class aClass = Class.forName(classPath);
                Object instance = aClass.getConstructor().newInstance();
                String key = (String) entry.getKey();
                beans.put(key, instance);//student,student对象
            }
        } catch (IOException e) {
            e.printStackTrace();
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

    public static Object getBean(String name){
        return beans.get(name);
    }


}
