package com.itheima.day9_10;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //在模块下建立b.txt
        File f1 = new File("object\\b.txt");
//      f1.createNewFile();
        File f2 = new File("C:Users\\hxdri\\Desktop\\aaa");
        f2.mkdir();
        File f3 = new File(f2,"a.txt");
        System.out.println(f3);
        f3.createNewFile();
        boolean delete = f3.delete();
        boolean delete1 = f2.delete();
        System.out.println(delete);
        System.out.println(delete1);

    }
}
