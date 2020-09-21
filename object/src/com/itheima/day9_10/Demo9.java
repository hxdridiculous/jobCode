package com.itheima.day9_10;

import java.io.File;
import java.io.IOException;

public class Demo9 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("test.txt");
        if (file1.exists()){ }else {file1.createNewFile();}
        File file2 = new File("一级目录");
        if (file2.exists()){ }else {file2.mkdirs();}
        File file3 = new File("目录A/目录B/目录C");
        if (file3.exists()){ }else {file3.mkdirs();}
    }
}
