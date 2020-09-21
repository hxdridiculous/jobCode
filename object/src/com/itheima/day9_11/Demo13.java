package com.itheima.day9_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("object\\src\\com\\itheima\\day9_11\\2.txt"));
        ArrayList list = new ArrayList();
        String lan;
        while ((lan = br.readLine()) != null) {
            list.add(lan);
        }
        Collections.shuffle(list);
        index(list, list.size(), 1);
    }

    private static void index(ArrayList list, int a, int b) {
        Scanner sc = new Scanner(System.in);
        if (list.size() != 0) {
            a--;
            System.out.println("今日第" + (b++) + "位幸运学生是" + list.remove(a) + "---输入over结束程序");
            String c = sc.nextLine();
            if (!"over".equalsIgnoreCase(c)) {
                index(list, a, b);
            }
        }
    }
}
