package com.itstep.lesson._5;
//Write a method that returns the largest of four numbers. Numbers are passed as parameters.
public class Task3 {
    static int returnLargestNum(int a, int b, int c, int d) {

        if ((a > b) && (a > c) && (a > d))
            return a;
        if ((b > a) && (b > c) && (b > d))
            return b;
        if ((c > a) && (c > b) && (c > d))
            return c;
        if ((d > a) && (d > b) && (d > c))
            return d;
        return a;
    }

    public static void main(String[] args) {
        int n = returnLargestNum(45, 88, -8, 24);
        System.out.println(n);

    }
}
