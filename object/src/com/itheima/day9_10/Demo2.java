package com.itheima.day9_10;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        //查看目录里面所有文件
        File file = new File("C:\\Practise\\jobCode\\object\\src\\com\\itheima");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
