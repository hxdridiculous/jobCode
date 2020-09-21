package com.itheima.day9_10;

import java.io.*;

public class Demo7 {
    public static void main(String[] args) throws IOException {
        File file = new File("object\\3.txt");
        file.createNewFile();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("object\\src\\com\\itheima\\day9_10\\3.txt"));
        int b ;
        while ((b =bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(b);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
