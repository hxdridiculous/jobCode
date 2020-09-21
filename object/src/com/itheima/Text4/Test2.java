package com.itheima.Text4;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number = 9;
        boolean index1 = false;
        int index = 0;
        int min = 0;
        int max = arr.length-1;
        int mid = (int) Math.floor((max - min) / 2);
        for (int i = 0; i < arr.length; i++) {
            if (max == mid || min == mid) {
                if (arr[min] == number) {
                    index = min;
                    index1 = true;
                    break;
                } else if (arr[max] == number) {
                    index = max;
                    index1 = true;
                    break;
                }
            } else if (arr[mid] == number) {
                index = mid;
                index1 = true;
                break;
            } else if (arr[mid] > number) {
                max = mid - 1;
                mid = (int) (mid - 1 - Math.ceil((max - min) / 2));
            } else if (arr[mid] < number) {
                min = mid + 1;
                mid = (int) (mid + 1 + (max - min) / 2);
            } else {
                index1 = false;
                break;
            }
        }
        if (index1 == true) {
            System.out.println(index);
        } else if (index1 == false) {
            System.out.println("没有元素");
        }
    }
}

