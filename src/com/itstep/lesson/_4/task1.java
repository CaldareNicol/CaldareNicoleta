package com.itstep.lesson._4;
//The user enters two numbers from the keyboard. Display all odd numbers in the specified range.
// If the range limits were specified incorrectly, normalize them. For example, the user entered 20 and 11,
// normalize the limits so that 11 becomes the beginning of the range and 20 the end.

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Enter other number");
        int num2 = scanner.nextInt();
        int i,result;
        int start;
        int end;
        if(num1<num2){
            start=num1;
            end=num2;
        }else{
            start=num2;
            end=num1;
        }
        for (i=start;i<=end; i++) {
            result = i % 2;
            if (result==1) {
                System.out.println("The odd numbers is: " +i);
            }
        }
    }
    }
