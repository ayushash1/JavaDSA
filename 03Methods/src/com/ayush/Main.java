package com.ayush;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // take an input of two num and print sum}
        sum();
        int ans = sum2(20, 30);
        System.out.println(ans);
        String persno = myGreet("Ayush");
    }

    private static String myGreet(String greet) {
        String s = "hello" + greet;
        return s;
    }


    static int sum2 (int a, int b) {
        return a + b;
    }
        static void sum () {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number 1 : ");
            int num1 = input.nextInt();
            System.out.print("Enter number 2 : ");
            int num2 = input.nextInt();

            int sum = num1 + num2;

            System.out.println("The sum = " + sum);

        }
}
