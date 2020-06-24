package com.itstep.lesson._5;

public class Task1 {
    //Write a method that takes two numbers as a parameter and displays all even numbers between them.
    static void displayEvenNum(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            int result = i % 2;
            if (result == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        displayEvenNum(3, 18);
    }
}
