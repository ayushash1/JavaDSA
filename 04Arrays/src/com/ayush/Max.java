package com.ayush;

import java.util.Arrays;

import static com.ayush.Swap.swap;

public class Max {
    public static void main(String[] args) {

        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(Arrays.toString(arr));
        int maxelement = maxRange(arr, 1, 3);
        System.out.println(maxelement);
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    static int max(int[] arr) {

        if (arr.length == 0){
            return -1;
        }

        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        return m;
    }

    static int maxRange(int[] arr, int start, int end) {

        if (end > start){
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int m = arr[start];
        for (int i = 0; i < end; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        return m;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }




}