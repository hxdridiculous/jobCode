package com.itheima.day9_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("object\\src\\com\\itheima\\day9_11\\1.txt",true);
        //写一个字符
        fw.write("a");
        char[] cha = {97,98,99,13,10};
        //写一个字符数组
        fw.write(cha);
        //写入字符数组的不一部分
        fw.write(cha,0,2);
        String s  =  "你好世界\n\t";
        //写一个字符串
        fw.write(s);
        //写一个字符串的一部分
        fw.write(s,0,1);
        fw.close();
    }
}
