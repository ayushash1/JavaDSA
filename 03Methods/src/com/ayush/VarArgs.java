package com.ayush;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7);
        multiple(12, 33, "ayush", "person1", "person2");
    }

    static void multiple(int a, int b, String ...v){

    }
    static void fun(int  ...v){
        System.out.println(Arrays.toString(v));
    }
}
