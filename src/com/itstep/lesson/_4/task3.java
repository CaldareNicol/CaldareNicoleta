package com.itstep.lesson._4;

import java.util.Scanner;

//The user enters the length of a line and a symbol which the line should be made of.
// Display a vertical line made of the entered symbol of the specified length.
// For example, if the user entered 5 and %, the output would be as follows:
//%
//%
//%
//%
//%
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for length");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter a symbol");
        String sim = scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println(sim);

        }
    }
}
