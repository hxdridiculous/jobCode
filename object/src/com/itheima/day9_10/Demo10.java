package com.itheima.day9_10;

import java.io.File;

public class Demo10 {
    /***public static void main(String[] args) {
        File file = new File("C:\\Users\\hxdri\\Desktop\\aaa");
        traversal(file);

    }

    private static void traversal(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                System.out.println("前面文件  后面路径"+file1.getAbsolutePath());
            }else{
                System.out.println( "前面文件夹  后面路径"+file1.getAbsolutePath());
                traversal(file1);
            }
        }
    }*/
    //"C:\\Users\\hxdri\\Desktop\\aaa"
    /*public static void main(String[] args) {
        File file = new File("C:\\Users\\hxdri\\Desktop\\aaa");
        //处理文件夹的方法
        dir(file);
    }

    public static void dir(File file) {
        File[] arr = file.listFiles();
        for (File f : arr) {
            if(f.isFile()){
                System.out.println("文件:"+f.getAbsolutePath());
            }else {
                //说明f是文件夹,先打印,然后再递归处理
                System.out.println("文件夹:"+f.getAbsolutePath());
                dir(f);
            }
        }
    }*/
    public static void main(String[] args) {
        File file =new File("C:\\\\Users\\\\hxdri\\\\Desktop\\\\aaa");
        dir(file);
    }

    private static void dir(File file) {
        File[] arr = file.listFiles();
        for (File f : arr) {
            if (f.isFile()){
                System.out.println(f.getAbsolutePath());
            }else {
                dir(f);
            }

        }
        System.out.println(file.getAbsolutePath());
    }
}
