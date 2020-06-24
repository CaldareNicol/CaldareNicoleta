package com.itstep.lesson._3;
//The user enters a number from the keyboard. Check whether it is even or odd.
// If the number is even, display the number and the phrase "Even number."
// If the number is odd, display the number and the phrase "Odd number."
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNumber = scanner.nextInt();

        int impartire = userNumber % 2;
       String result = (impartire ==0) ? "Even number." : "Odd number." ;
      //System.out.println(result);​

    }
}
