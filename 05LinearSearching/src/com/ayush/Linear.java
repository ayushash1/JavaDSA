package com.ayush;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 190;
        int index = linearSearch(arr, target);
        System.out.println(index);

    }

    // search in the array : return the index if item found
    // return -1 if not found
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }


}