package com.itheima.Text4;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {6,2,5,3,1,8,9,10,4,7};
        quiteSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    private static void quiteSort(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int left1 = left;
        int right1 = right;
        int baseNumber = arr[left1];
        while (left!=right){
            while (arr[left]<=baseNumber && right>left){
                left++;
            }
            while (arr[right]<=baseNumber && right>left){
                right++;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] =temp;
        }
        int temp = arr[left];
        arr[left] = arr[left1];
        arr[left1] =temp;

    }
}
