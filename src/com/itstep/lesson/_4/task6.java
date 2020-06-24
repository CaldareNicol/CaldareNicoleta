package com.itstep.lesson._4;

import java.util.Scanner;

//The user enters elements of a one-dimensional array from the keyboard. Find the sum and arithmetic mean of the array element;
// display all elements of the array.
public class task6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 5 elements for one-dimensional array");
        int[] array = new int[5];
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
        System.out.println("Arithmetic mean of the array element is: " +sum/array.length);
    }
}
