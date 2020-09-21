package com.itheima.day9_8;

public class Test2 {
    public static void main(String[] args) {
        int sum = getSum(1,1,2);
        System.out.println("3个整数的和:"+sum);
        int sum2 = getSum(1,1,2,4);
        System.out.println("4个整数的和:"+sum2);
    }

    private static int getSum(int a,int...arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum+a;
    }
}
