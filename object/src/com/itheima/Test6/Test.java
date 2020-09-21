package com.itheima.Test6;

public class Test {
    public static void main(String[] args) {
        int b = add(100);
        System.out.println(b);
    }

    private static int add(int i) {
        if (i==1){
        return 1;
        }else {
            return i+add(i-1);
        }
    }
}
