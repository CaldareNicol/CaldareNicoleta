package com.itstep.lesson._15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int weight = scanner.nextInt();
            if (weight>100){
                throw new MyUncheckedException("Invalid product");
            }
            System.out.println("Product weight: ");
        }catch (MyUncheckedException n){
            System.out.println(n.getMessage());
        }

    }
}
