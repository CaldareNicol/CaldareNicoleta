package com.itstep.lesson._11;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static  ArrayList<Integer> list = new ArrayList<>();
    public static   Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many items you have?");
        int numOfItem=scanner.nextInt();

        System.out.println("Enter items");

        for (int i = 0; i < numOfItem; i++) {
            list.add(scanner.nextInt());
        }
        boolean done=false;
         do{
            System.out.println("Write the number whose function you want to do. (Choose \"0\" to exit" +
                    "\n1. Add an item to the list; " +
                    "\n2. Delete an item from the list;" +
                    "\n3. Display the list content; " +
                    "\n4. Check if a value is in the list; " +
                    "\n5. Replace the value in the list."  );

            int option=scanner.nextInt();
            switch (option){
                case 1:
                    addItem();

                    break;
                case 2:
                    deleteItem();
                    break;
                case 3:
                    displayList();
                    break;
                case 4:
                    checkValue();
                    break;
                case 5:
                    replaceValue();
                    break;
                case 0:
                    System.out.println("Goodbye");
                    done=true;
            }
        } while (!done);
    }

    public static void addItem(){
        System.out.println("Enter an item you want to add");
       int item=scanner.nextInt();
        list.add(item);
    }
    public static void deleteItem(){
        System.out.println("Choose an item you want to delete");
       int item=scanner.nextInt();
    list.remove(item);
    }
    public static void displayList(){
        System.out.println(list);
    }
    public static void checkValue(){
        System.out.println("Choose a value of list");
        int item=scanner.nextInt();
        list.contains(item);
    }
    public static void replaceValue(){
        System.out.println("Choose an item you want to delete");
        int item=scanner.nextInt();
        int itemReplaced=scanner.nextInt();
        list.remove(item);
        System.out.println("Enter an item you want to replace");
        list.add(itemReplaced);
    }
}
