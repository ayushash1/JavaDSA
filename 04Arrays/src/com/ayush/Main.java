package com.ayush;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Q store a roll number
        int a = 19;

        // Q store a name
        String name = "Ayush";


        // systax
        // datatype[] variable_name = new datatype[size]
        // store 5 roll num
        int[] rnos = new int[5];
        // or
        int[] rnos1 = {23, 32, 33, 45, 54};
        System.out.println(Arrays.toString(rnos));
        System.out.println(Arrays.toString(rnos1));


        int[] ros; // declaration of array. ros is getting defined in stack
        ros = new int[5]; // initialization : actually here object is being created in the heap
//        System.out.println(ros[3]);

        String[] arr = new String[4];
        System.out.print(Arrays.toString(arr)); // null
        // null is similar to none in python


    }
}