package com.itheima.Text4;

public class Test4 {
    public static void main(String[] args) {
        int [] arr = {431,54,25,25,26,45,2,4,65,3,64,6,46,7,54};
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i] =arr[j];
                    arr[j]=temp;

                }
                a++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(a);
    }
}
