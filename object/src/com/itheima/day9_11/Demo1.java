package com.itheima.day9_11;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好世界";
        //转换成为默认的UTF-8字符集
        byte[] bytes = s.getBytes();
        //转换成为GBK字符集
        byte[] bytes2 = s.getBytes("gbk");
        //输出
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes2));

        //默认的UTF-8解码
        String utf = new String(bytes);
        //默认的GBK解码
        String gbk = new String(bytes2, "GBK");
        //输出
        System.out.println(utf);
        System.out.println(gbk);
    }
}
