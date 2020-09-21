package com.itheima.day9_10;

import java.io.File;

public class Demo11 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hxdri\\Desktop\\aaa");
        long a =0;
        Long traversal = traversal(file, a);
        System.out.println(traversal);

    }

    private static Long traversal(File file, Long a) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                a+=file1.length();
            }else{
                traversal(file1 ,a);
            }
        }
        return a;
    }
}
