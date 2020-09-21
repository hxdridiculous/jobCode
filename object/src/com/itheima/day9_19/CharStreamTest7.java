package com.itheima.day9_19;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;

public class CharStreamTest7 {
    public static void main(String[] args) throws IOException {
//object52bb5d5402264ab29f00d334265d1a6b.txt
        BufferedReader bfr = new BufferedReader(new FileReader("object52bb5d5402264ab29f00d334265d1a6b.txt"));
        String s = bfr.readLine();
        String[] s1 = s.split(" ");
        int [] ints = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            ints[i]=Integer.parseInt(s1[i]);
        }
        Arrays.sort(ints);
        String s2 = "";
        for (int i = 0; i < ints.length; i++) {
            s2+=(ints[i]+" ");
        }
        BufferedWriter bfw = new BufferedWriter(new FileWriter("object52bb5d5402264ab29f00d334265d1a6b.txt"));
        bfw.write(s2);
        bfw.flush();
        bfr.close();
        bfw.close();
    }
}
