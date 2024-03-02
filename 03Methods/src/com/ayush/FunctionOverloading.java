package com.ayush;

import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(45);
        fun("Ayush Ashtikar");
        // Function overloading at compile time (when it compiles) it decides which function to run
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
//        demo(); // it wont know which demo to run so error
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void demo( int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo( String ...v){
        System.out.println(Arrays.toString(v));
    }


    // two or more functions can exist with the same name if the parameters are different
    static void fun(int a){
        System.out.println(a);
        System.out.println("First one");

    }

    static void fun(String name){
        System.out.println(name);
        System.out.println("Second one");

    }


}
