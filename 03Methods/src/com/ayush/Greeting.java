package com.ayush;


import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greet();
        int sum = sum();
        System.out.println(sum);
    }
    // return the value
    static int sum() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = input.nextInt();

        return num1 + num2;

    }
    static void greet(){
        System.out.println("hello world");
    }
}
