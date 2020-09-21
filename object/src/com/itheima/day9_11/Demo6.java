package com.itheima.day9_11;

import java.io.*;

public class Demo6 {
    //字符串冲流复制文件（文本）
    public static void main(String[] args) throws IOException {
        BufferedReader  br  = new BufferedReader(new FileReader("C:\\JAVA SE\\就业班\\day9.11_IO流02\\day12-作业-字符流-对象流-Properties\\窗里窗外.txt"));
        BufferedWriter bw  = new BufferedWriter(new FileWriter("object\\src\\com\\itheima\\day9_11\\3.txt"));


        char[] chars = new char[1024];
        int lan ;
        while ((lan= br.read(chars))!=-1){
            bw.write(chars,0,lan);
            //字符串刷新
            bw.flush();
        }
        br.close();
        bw.close();

    }
}
