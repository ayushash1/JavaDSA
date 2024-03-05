package com.ayush;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list= new ArrayList<>(10);

        list.add(54);
        list.add(64);

        System.out.println(list);

        boolean a = list.contains(54);
        System.out.println(a);
        list.set(0, 99);  // set 0th element to 99
        System.out.println(list);

        list.remove(1);
        // input
        for (int i = 0; i < 5 ; i++){
            list.add(input.nextInt());
        }

        // output
        for (int i = 0; i < 5 ; i++){
            System.out.println(list.get(i));
        }
    }
}
