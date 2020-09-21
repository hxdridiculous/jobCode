package com.itheima.day9_10;

import java.io.*;

public class Demo14 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("object\\src\\com\\itheima\\day9_10\\1.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("object\\src\\com\\itheima\\day9_10\\4.txt"));
        byte[] bytes = new byte[1024];
        int lan;
        while ((lan=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(bytes,0,lan);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
