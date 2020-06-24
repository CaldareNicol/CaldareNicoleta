package com.itstep.lesson._4;

import java.util.Scanner;

//Display a multiplication table in the range specified by the user. For example, if the user entered 3 and 5,
// the table may be as follows:
//3*1 = 3
//3*2 = 6
//3*3 = 9
// ............
//3* 10 = 30
//......................................................
//5*1 = 5
// 5 *2 = 10
//5 *3 = 15.....................
public class task5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
           int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();
        for (int i1=1;i1<=10;i1++){
            System.out.println(num1+ "*" +i1 + "=" + num1*i1);
        }
        System.out.println();
        for (int i2=1;i2<=10;i2++){
            System.out.println(num2+ "*" +i2 + "=" + num2*i2);
        }
        }

    }

