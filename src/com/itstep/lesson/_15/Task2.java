package com.itstep.lesson._15;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws Exception { //throws Exception

        boolean a = false;
        do {
            System.out.println("Enter a number from 0 to 9");
            Scanner scanner = new Scanner(System.in);
            String numString = scanner.nextLine();

            try {
                int num = Integer.parseInt(numString);
                if ((num >= 0) && (num < 10)) {
                    System.out.println(num);
                    a = true;
                } else {
                    throw new MyException("The number is not in the limit");
                }

            } catch (NumberFormatException e) {
                System.out.println("The input is not a number");
            }
        } while (!a);
    }

}

