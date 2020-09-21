package com.itheima.day9_10;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("object\\src\\com\\itheima\\day9_10\\1.txt");
        outputStream.write("hello".getBytes());
        outputStream.write(13);
        outputStream.write(10);
        outputStream.write("world".getBytes());
        //换行
        outputStream.write(13);
        outputStream.write(10);
       /* for (int i = 0; i < 100; i++) {
            outputStream.write(i);
            outputStream.write("\r\n".getBytes());
        }*/
        byte[] bytes = "\r\n".getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        byte[] byts = {67,68,69,70,71};
        outputStream.write(byts);
        //byts数组从第索引（包括2）个开始写入  写入2个
        outputStream.write(byts,2,2);
        outputStream.close();

    }
}
