package com.itstep.lesson._5;
public class Task4 {
    //Write a method that checks if a number is prime. The number is passed as a parameter.
    // If the number is prime,return true, otherwise false.
    static boolean checkPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n/2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        boolean z = checkPrime(-5);
        System.out.println(z);
    }
}
