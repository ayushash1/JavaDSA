package com.ayush;

import java.util.Scanner;

// in type conversion type of variable should be compatible
// like int and float

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
//        int num2 = input.nextFloat();   // Gives error
        System.out.println(num);

//        type casting
        int num3 = (int) (65.63f);
        // converts float to int



//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);
        // automatic type promotion in expression

        byte a = 50;
        byte b = 40;
        byte c = 100;
        // result of a*b extends the range of byte operator so
        // java automatically upgrading bytes to integers

        int d = a*b/c;

        byte e = 50;
//        e = e * 2; //would give error because we initialized d as byte but java would convert it to int

    }
}
