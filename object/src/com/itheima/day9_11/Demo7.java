package com.itheima.day9_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo7 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bfw = new BufferedWriter(new FileWriter("object\\src\\com\\itheima\\day9_11\\3.txt"));
        bfw.write("zhangsan");
        bfw.newLine();
        bfw.write("12323242");
        bfw.newLine();
        bfw.write("lishi");
        bfw.newLine();
        bfw.write("1312341324");
        bfw.flush();
        bfw.close();

    }

}
