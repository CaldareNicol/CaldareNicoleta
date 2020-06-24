package com.itstep.lesson._4;
import java.util.Scanner;
//Calculate the following numbers in a one-dimensional array filled by user:
//The sum of negative numbers.
//The sum of even numbers.
//The sum of odd numbers.
//The product of elements with indexes that can be divided by 3
//The product of the minimum and maximum elements.
//The sum of elements that are between the first and the last positive elements. (inclusive first, exclusive last)
public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for one-dimensional array");
        int[] array = new int[7];
        for (int i=0;i<7;i++ ){
         array[i]= scanner.nextInt();
        }
        //The sum of negative numbers.
        int sumN =0;
        for (int b :array){
            if (b<=0){
                sumN+=b;
            }
        }
        System.out.println("The sum of negative numbers is: " + sumN );

        //The sum of even numbers.
        int sumE=0;
        for (int c :array){
            if (c%2==0){
                sumE+=c;
            }
        }
        System.out.println("The sum of even numbers is " + sumE );

        //The sum of odd numbers.
        int sumO=0;
        for (int d:array){
            if (d%2==1){
                sumO+=d;
            }
        }
        System.out.println("The sum of odd numbers is: " + sumO);

        //The product of elements with indexes that can be divided by 3
        int prodI=1;
        for (int n:array){
            if (n>=3 && n%3==0) {
             prodI*=n;
            } else if (n<=-3 && n%3==0){
                prodI*=n;
            }
        }
        System.out.println("The product of elements with indexes that can be divided by 3 is: " + prodI);

        //The product of the minimum and maximum elements.
        int prodMax=0;
        int min =array[0];
        int max = array[0];
        for (int f:array){
            if (f<min){
                min=f;
            }
        }
        for (int p:array){
            if (p>max){
                max=p;
            }
        }
        prodMax = min+max;
        System.out.println(min);
        System.out.println(max);
        System.out.println("The  product of the minimum and maximum elements is: " + prodMax);

        //The sum of elements that are between the first and the last positive elements. (inclusive first, exclusive last)
        int sumLP=0;
        int minPos=max;
        for (int z:array){
            if (z<minPos && z>= 0){
                minPos=z;
            }
        }
        int maxPos=0;
        for (int m:array){
            if (m>0 && m>maxPos){
                maxPos=m;
            }
        }
        sumLP= minPos+maxPos;
        System.out.println(minPos);
        System.out.println(maxPos);
        System.out.println("The sum of elements that are between the first and the last positive elements is: "+ sumLP );





    }
}






