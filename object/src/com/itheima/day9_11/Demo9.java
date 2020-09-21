package com.itheima.day9_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Demo9 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new FileReader("object\\src\\com\\itheima\\day9_11\\3.txt"));
        String s = bfr.readLine();
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        for (int i = 0; i < arr.length; i++) {
            String one = s1[i];
            int i1 = Integer.parseInt(one);
            arr[i]=i1;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        bfr.close();
        BufferedWriter bfw = new BufferedWriter(new FileWriter("object\\src\\com\\itheima\\day9_11\\3.txt"));
        for (int i = 0; i < arr.length; i++) {
            bfw.write(arr[i]+" ");
            bfw.flush();
        }
        bfw.close();
    }
}
