package com.ayush;

public class Shadowing {
    // shadowing in java is a practice using variable with the same name withing the scope that overlaps

    static int x = 90; // declaring global variable // this will be shadowed at line 8

    public static void main(String[] args){
        System.out.println(x); // 90
        int x = 50; // the class variable at line 4 is shadowed by this
        System.out.println(x); // 40

        fun();


    }
    static void fun(){
        System.out.println(x);
    }


}
