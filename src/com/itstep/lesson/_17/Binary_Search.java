package com.itstep.lesson._17;

import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] myArray = new int[]{6,99,-3,19,-11};
        System.out.println("My Arrays: "+ Arrays.toString(myArray));

        bubbleSort(myArray);

       int indexOfNumber= binarySearch(myArray,6,0,myArray.length-1);
        System.out.println("Index od searched number is: "+ indexOfNumber );

    }

    private static void bubbleSort(int[] arraySort){

        int length= arraySort.length;
        for (int i=0 ;i<length;i++){
            boolean swapped=false;
            for (int index=0; index < length-1-i; index++){
                if (arraySort[index] > arraySort[index+1]){
                    int temp=arraySort[index];
                    arraySort[index]= arraySort[index+1];
                    arraySort[index+1]=temp;
                    swapped=true;

                }
            }
            System.out.println("Iteration "+ (i+1)+ "-"+ Arrays.toString(arraySort));
            if (!swapped){
                break;
            }
        }

    }

    private static int binarySearch(int[] array, int searchedNumber, int minBoundary, int maxBoundary) {
        if (maxBoundary >= minBoundary) {
            int midIndex = (minBoundary + maxBoundary) / 2;

            if (array[midIndex] == searchedNumber) {
                return midIndex;
            } else {
                if (array[midIndex] > searchedNumber) {
                    return binarySearch(array, searchedNumber, minBoundary, midIndex - 1);
                }
                return binarySearch(array, searchedNumber, midIndex - 1, maxBoundary);
            }
        }
            return -1;
        }
    }

