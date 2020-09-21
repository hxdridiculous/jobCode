package com.itheima.day9_17;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //获取系统加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        InputStream sras = ClassLoader.getSystemResourceAsStream("prop.properties");
        InputStreamReader inputStreamReader = new InputStreamReader(sras,"utf-8");
        Properties properties = new Properties();
        properties.load(inputStreamReader);
        System.out.println(properties);
        inputStreamReader.close();
    }
}
