package com.ayush;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("सेल्सियस मे तापमान लिखें  : ");
        double tempC = input.nextDouble();

        double tempF = (tempC * 9/5) + 32;

        System.out.println(tempC + " को फेरनहाइट मे " + tempF);
    }
}


