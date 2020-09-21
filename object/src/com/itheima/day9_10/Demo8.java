package com.itheima.day9_10;

import java.io.File;
import java.io.IOException;

public class Demo8 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\hxdri\\Desktop\\a.txt");
        File file2 = new File("C:\\Users\\hxdri\\Desktop\\aaaa");
        file.createNewFile();
        file2.mkdirs();
        //获取、打印file1和file2的绝对路径；
        System.out.println(file.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
        //获取、打印file1和file2的文件名和目录名；
        System.out.println(file.getName());
        System.out.println(file2.getName());
        //获取、打印file1和file2的文件大小；
        System.out.println(file.length());
        System.out.println(file2.getName());
        //分别判断file1和file2是否存在；
        System.out.println(file.exists());
        System.out.println(file2.exists());
        //分别判断file1是否是文件？是否是目录？
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        ////分别判断file2是否是文件？是否是目录？
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());

    }
}
