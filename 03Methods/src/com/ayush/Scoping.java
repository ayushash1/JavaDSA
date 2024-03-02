package com.ayush;

public class Scoping {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        String name = "Rahul";

        {
            a = 50;
            int c = 99;
            name = "Ayush";
            System.out.println(name);

        }
//        System.out.println(c);  // block scope error
        System.out.println(a);
        System.out.println(name);

    }
    static void random(int marks){
        int num = 11;
        System.out.println(num);
        System.out.println(marks);
    }
}
