package com.itstep.lesson._4;

import java.util.Scanner;

//The user enters two numbers (the beginning and the end of the range). Analyze all the numbers in this range.
// The output should be according to the rules below.If the number is divisible by 3 (it is divided by 3 without a remainder),
// display the word Fizz. If the number is divisible by 5, display the word Buzz.
// If the number is divisible by 3 and 5, output Fizz Buzz. If the number is not divisible by 3 or 5, output the number itself.
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1 = scanner.nextInt();
        System.out.println("Enter a bigger number");
        int n2 = scanner.nextInt();
        for (; n1 <= n2; n1++) {
            int div3 = n1 % 3;
            int div5 = n1 % 5;

            if (div3 == 0 && div5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (div3 == 0) {
                System.out.println("Fizz");
            } else if (div5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n1);
            }

        }


    }
}



