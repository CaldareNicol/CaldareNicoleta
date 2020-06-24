package com.itstep.lesson._4;
import java.util.Scanner;
// The user enters a number from the keyboard. Calculate the factorial of the number.
// For example, if 3 was entered, the factorial would be 1*2*3 = 6.
// The factorial formula is n! = 1*2*3...*n, where n is the number to calculate the factorial.
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int result=1;

        for (int i = 1; i <= num; i++) {
            result *=i;
    }
        System.out.println("The factorial of the number is: " + result);

    }
}


