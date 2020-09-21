package com.itheima.day9_10;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hxdri\\Desktop\\aaa");
        if (file.exists()){
            delete(file);
        }else {
            file.mkdirs();
        }
    }
    private static void delete(File file) {
        //编历file  获取里面的文件和文件夹
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                //删除文件
                file1.delete();
            }else {
                //递归进入文件夹，再次运行，进去删除文件
                delete(file1);
            }
        }
        //删除自身文件夹
        file.delete();
    }
}
