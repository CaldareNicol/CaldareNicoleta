package com.itstep.lesson._3;
//The user enters the number of meters from the keyboard.
// Based on the user's choice,the program converts meters to miles, inches, or yards

import java.util.Scanner;

public class task4 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the measure");
            double m = scanner.nextDouble();
            System.out.println("Choose number to covert in \n1=miles or 2=inches or 3=yards");
            int cv = scanner.nextInt();

            if (cv == 1) {
                System.out.println((m * 0.000621371192) + " miles");
            } else if (cv == 2) {
                System.out.println((m * 39.3700787) + " inches");
            } else {
                System.out.println((m * 1.0936133) + " yards");
            }


        }

}
