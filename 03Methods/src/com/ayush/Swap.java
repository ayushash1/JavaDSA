package com.ayush;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // code to swap numbers
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
        System.out.println(a + " " + b);
    }

    static void swap( int a, int b){
        int temp = a;
        a = b;
        b = temp;

        // this change will only be valid in this scope only.

    }
}
