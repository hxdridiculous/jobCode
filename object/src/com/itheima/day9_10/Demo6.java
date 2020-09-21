package com.itheima.day9_10;

import java.io.*;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        File file = new File("object\\1.txt");
        FileInputStream fis = new FileInputStream("object\\1.txt");
        FileOutputStream fos = new FileOutputStream("object\\src\\com\\itheima\\day9_10\\2.txt");
        file.createNewFile();
        int b;
        while ((b=fis.read())!=-1){
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}

