package com.itstep.lesson._11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static  Map<String ,String> users=new HashMap<>();
   public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        boolean done=false;
        do {
            System.out.println("Write the number whose function you want to do.\n" +
                    "1. Add a new user; \n" +
                    "2. Delete a user; \n" +
                    "3. Check if the user exists; \n" +
                    "4. Change the username of a user; \n" +
                    "5. Change the password of a user.");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addUser();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    checkUser();
                    break;
                case 4:
                    changeUserName();
                    break;
                case 5:
                    changePassword();
                    break;
                case 0:
                    System.out.println("Goodbye");
                    done=true;
            }
        }while (!done);


    }
    public static void addUser(){
        System.out.println("Enter a user name");
        String userName=scanner.nextLine();
        System.out.println("Enter a password");
        String password=scanner.nextLine();
       String valueA= users.put(userName,password);

        System.out.println("You created the user with name: "+ userName+ " and password: "+password);
        System.out.println("The list of user is: " + users);
    }
    public static void deleteUser(){
        System.out.println("Enter user who want to delete");
        String userName=scanner.nextLine();
       String valueD= users.remove(userName);
       if (valueD!=null) {
           System.out.println("The user: " + userName + " has been deleted");

       }else{
           System.out.println("User has not been found");
       }
        System.out.println("The list of user is: " + users);
    }
    public static void checkUser(){
        System.out.println("Enter user who want to check");
        String userName=scanner.nextLine();

        if (users.containsKey(userName)){
            System.out.println("The user "+userName+" is in the list");
        }else {
            System.out.println("The user " + userName + " is not in the list");
        }

        System.out.println("The list of user is: "+users);


    }
    public static void changeUserName(){
        System.out.println("Enter the user name you want to change");
        String userName=scanner.nextLine();
        System.out.println("Enter other user name");
        String nameChange=scanner.nextLine();

        if (users.containsKey(userName)){
            users.put(nameChange,users.get(userName));
            users.remove(userName);
        }else{
            System.out.println("The user has not found in list");
        }


        System.out.println("The list of user is: " + users);
    }

    public static void changePassword(){
        addUser();
        System.out.println("The password was changed");
        System.out.println("The list of user is: " + users);

    }
}
