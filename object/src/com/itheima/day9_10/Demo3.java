package com.itheima.day9_10;

import java.io.File;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("object\\aaa");
        if (!file.exists()) {
            file.mkdirs();
        }else {
            File[] files = file.listFiles();
            for (File file1 : files) {
                System.out.println(file1.getName());
            }
        }
        File file1 = new File(file, "a.txt");
        file1.createNewFile();
    }
}
