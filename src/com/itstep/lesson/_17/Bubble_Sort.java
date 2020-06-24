package com.itstep.lesson._17;
//timp-O(N^2)

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class Bubble_Sort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray1 = new int[100];
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = random.nextInt(100000);

//            int[] myArray = new int[]{33, 46, 78, 1, -8, 7};
            System.out.println("My Arrays: " + Arrays.toString(myArray1));

            bubbleSort(myArray1);
            System.out.println("My Arrays: " + Arrays.toString(myArray1));

//            LocalTime start = LocalTime.now();
//            bubbleSort(myArray1);
//            System.out.println("My Arrays: " + Arrays.toString(myArray1));
//            LocalTime end =LocalTime.now();
//            System.out.println(Duration.between(start,end));

            //Instant start = Instant.now();
//Thread.sleep(63553);
//Instant end = Instant.now();
//System.out.println(Duration.between(start, end));
        }
    }

    private static void bubbleSort(int[] arraySort) {

        int length = arraySort.length;
        for (int i = 0; i < length; i++) {
            boolean swapped = false;
            for (int index = 0; index < length - 1 - i; index++) {
                if (arraySort[index] > arraySort[index + 1]) {
                    int temp = arraySort[index];
                    arraySort[index] = arraySort[index + 1];
                    arraySort[index + 1] = temp;
                    swapped = true;

                }
            }
            System.out.println("Iteration " + (i + 1) + "-" + Arrays.toString(arraySort));
            if (!swapped) {
                break;
            }
        }
    }

//    public static void bubort(int[] array, int n){
        //        int n = array.length;
//        for (int i = 1; i < n; i++) {
//            int j = i;
//            while (j > 0 && array[j - 1] > array[j]) {
//                //cautam pozitia pe care sa mutam array[i]
//                int temp = array[j];
//                array[j] = array[j - 1];// inversaza pozitiile
//                array[--j] = temp;
////                System.out.println(Arrays.toString(array));
//            }
//        }
//    }
}
