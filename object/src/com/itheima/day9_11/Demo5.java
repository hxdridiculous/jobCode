package com.itheima.day9_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        String a = "mima";
        String b = "zhanghu";
        FileWriter fileWriter = new FileWriter("object\\src\\com\\itheima\\day9_11\\2.txt");
        fileWriter.write(a);
        fileWriter.write("\n");
        fileWriter.write(b);
        fileWriter.flush();
        fileWriter.close();
    }
}
