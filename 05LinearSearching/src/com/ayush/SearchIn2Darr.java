package com.ayush;

import java.util.Arrays;

public class SearchIn2Darr {
    public static void main(String[] args) {
        int[][] arr2d = new int[][]{
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target = 18;
        int [] ans = search(arr2d, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[j].length; j++) {
                if (arr[i][j] == target){
                    return new int []{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
