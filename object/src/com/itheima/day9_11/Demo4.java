package com.itheima.day9_11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        //创建对象FileReader
        FileReader fileReader = new FileReader("object\\src\\com\\itheima\\day9_11\\1.txt");
//        创建一个数组
        char[] chars = new char[1024];
        //数组内容大小
        int len;
        //判断是否为-1，输出字符
        while ((len=fileReader.read(chars))!=-1){
            //类型转换为String
            System.out.println(new String(chars,0,len));
        }
        //释放资源
        fileReader.close();
    }
}
