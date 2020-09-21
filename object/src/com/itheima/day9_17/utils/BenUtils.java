package com.itheima.day9_17.utils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BenUtils {
    public static HashMap<String, Object> hamp = new HashMap<>();
    static {
        try {
            InputStream sras = ClassLoader.getSystemResourceAsStream("prop.properties");
            Properties properties = new Properties();
            properties.load(sras);
            Set<Map.Entry<Object, Object>> entries = properties.entrySet();
            for (Map.Entry<Object, Object> entry : entries) {
                String value = (String) entry.getValue();
                Class<?> aClass = Class.forName(value);
                Object o = aClass.getConstructor().newInstance();
                String key = (String) entry.getKey();
                hamp.put(key,o);
                sras.close();
            }
        } catch (IOException | ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static Object getBean(String object){
        return hamp.get(object);
    }
}
