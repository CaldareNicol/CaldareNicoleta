package com.itstep.lesson._17;
//timp- O(N^2)

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Insertion_Sort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray1 = new int[1000];
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = random.nextInt(1000000);
        }
        System.out.println("My Array: " + Arrays.toString(myArray1));

        // Calculam durata metodei
        long startTime = System.nanoTime();

        insertionSort(myArray1);

        System.out.println("My Array, insertion sort: " + Arrays.toString(myArray1));
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);


//        long startTime2 = System.nanoTime();
//        bubbleSort(myArray1);
//        System.out.println("My Array, insertion sort: " + Arrays.toString(myArray1));
//        long endTime2 = System.nanoTime();
//        long timeElapsed2 = endTime2 - startTime2;
//
//        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
//        System.out.println("Execution time in milliseconds : " +
//                timeElapsed / 1000000);


    }


    public static void insertionSort(int[] array) {
        int i, key, j;
        for (i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > key) {
                //cautam pozitia pe care sa mutam key
                array[j + 1] = array[j]; // inversaza pozitiile
                j = j - 1;
            }
            array[j + 1] = key;

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
//            System.out.println("Iteration " + (i + 1) + "-" + Arrays.toString(arraySort));
            if (!swapped) {
                break;
            }
        }
    }
}

