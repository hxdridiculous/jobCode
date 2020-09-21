package com.itheima.day9_11;

import java.io.FileReader;
import java.nio.charset.Charset;

public class Demo11 {
    public static void main(String[] args) throws Exception {
        FileReader fw = new FileReader("C:\\Users\\hxdri\\Desktop\\窗里窗外.txt", Charset.forName("gbk"));
        long l = System.currentTimeMillis();
        //char[] arr = new  char[1024];
        int lan;
        while ((lan=fw.read(/*arr*/))!=-1){
            System.out.print((char) lan/*new String(arr,0,lan)*/);
        }
        long l1 = System.currentTimeMillis();
        System.out.println("---------------------------------------------");
        System.out.println(l1-l+"毫秒时间");
    }
}
