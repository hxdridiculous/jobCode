package com.itheima.day9_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("object\\src\\com\\itheima\\day9_10\\1.txt");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("请输入学生信息,学生信息之间使用逗号分隔（ok表示结束）");
            String a =sc.next();
            if ("ok".equalsIgnoreCase(a)){
                System.out.println("拜拜");
            break;
            }else {
                outputStream.write(a.getBytes());
            }
        }
        outputStream.close();

    }
}
