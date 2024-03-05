package com.ayush;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 28;
        System.out.println(lSearchInRange(arr, target, 1, 4));
    }
    static int lSearchInRange(int[] arr,int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int i = start; i < end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
