package com.itstep.lesson._5;

public class Human {
    String firstName;
    String secondName;
    int age;
   // String job;
   // String homeAddress;
    Job myJob;
    Address myAddress;

    public Human(){
    }

    public void rest_at_home() {
        System.out.println("My home address is: " + myAddress.street);
    }

    public void about_me() {

        System.out.println("My name is " + firstName + " " + secondName);
        System.out.println("I am " + age + " years old");
        System.out.println("My job is " + myJob.major);
      rest_at_home();

    }
}




