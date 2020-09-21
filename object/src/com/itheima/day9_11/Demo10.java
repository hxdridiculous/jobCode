package com.itheima.day9_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo10 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\hxdri\\Desktop\\窗里窗外.txt"),"gbk");
        int lan ;
        while ((lan=inputStreamReader.read())!=-1){
            System.out.print((char) lan);
        }
        inputStreamReader.close();


    }
}
