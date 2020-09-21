package com.itheima.day9_19;

import java.io.*;

public class DocCopy {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\hxdri\\Desktop\\老罗.md"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\hxdri\\Desktop\\111.md"));
        byte[] bytes = new byte[1024];
        int a;
        while ((a = bis.read(bytes))!=-1){
            bos.write(bytes,0,a);
        }
        bos.flush();
        bis.close();
        bos.close();
    }
}
