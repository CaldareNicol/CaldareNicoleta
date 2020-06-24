package com.itstep.lesson._3;
//The user enters two numbers from the keyboard. Calculate the sum, difference, and product of these numbers. Display the result.
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNr = 0, secondNr = 0;

        System.out.println("Enter first number");
        firstNr = scanner.nextInt();
        System.out.println("Enter the second number");

        secondNr = scanner.nextInt();

        int sum = firstNr + secondNr;
        int difference = firstNr - secondNr;
        int product = firstNr * secondNr;

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
    }
}

