package com.itheima.day9_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("object\\src\\com\\itheima\\day9_11\\3.txt"));
        /*System.out.println(bfr.readLine());
        System.out.println(bfr.readLine());
        System.out.println(bfr.readLine());
        System.out.println(bfr.readLine());*/
        String line;
        while((line=bfr.readLine())!=null){
            System.out.println(line);
        }
        bfr.close();
    }
}
