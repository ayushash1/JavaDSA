package com.ayush;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // 2-d array

//        int[][] arr2d = new int[3][3];  // size of rows is mandatory not size of column

        int [][] arr  = {    // not stored continuously
                {1, 2, 3 },     // in heap, it is stored as array of arrays
                {4, 5, 6 },     //
                {7, 8, 9 },
        };

        // input

        for (int i = 0; i < arr.length; i++){
            for( int j = 0; j < arr[i].length; j++){
                arr[i][j]  = input.nextInt();
            }
        }
        // Output

        for (int i = 0; i < arr.length; i++){
            for( int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }








    }
}
