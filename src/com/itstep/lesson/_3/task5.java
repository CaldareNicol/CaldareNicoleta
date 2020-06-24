package com.itstep.lesson._3;

import java.util.Scanner;
//The user enters from the keyboard the number of hours. If the received value is in the range from 0 to 6,
// display "Good Night," if in the range from 6 to 13, display "Good Morning," if in the range from 13 to 17,
// display "Good Day," if in the range from 17 to 0, display "Good Evening." The upper limit of the range is not included.
// For example, number 6 refers to the range from 6 to 13.
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of hours");
        int num = scanner.nextInt();
        if (num > 0 && num <= 6) {
            System.out.println("Good Night");
        } else if (num > 6 && num <= 13) {
            System.out.println("Good Morning");
        } else if (num > 13 && num <= 17) {
            System.out.println("Good Day");
        } else {
            System.out.println("Good Evening");
        }
    }
}