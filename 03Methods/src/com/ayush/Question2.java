package com.ayush;

public class Question2 {
    public static void main(String[] args) {

        for (int i=100; i<=999; i++){
            if(isArmstrong(i)){
                System.out.print(i + "   ");
            }
        }
    }
    // print all the three digit armstrong numbers
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n  = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
