package com.itstep.lesson._7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Address address1 = new Address("Moldova", "Chisinau", "Decebal");
        //   System.out.println(address1.getFullAddress());

        Address address2 = new Address("Moldova", "Calarasi", "Biruintei");
        //  System.out.println(address2.getFullAddress());

        //case 1
        User user1 = new User("iurcuandreea@gmail.com");
        System.out.println(user1.userId);
        System.out.println(user1.username);
        System.out.println(user1.userAddresses);  //gol

        user1.addAddress("Work", address1);
        user1.addAddress("Home", address2);
        //  System.out.println(user1.userAddresses.get("Home").getFullAddress());   //are valori
        System.out.println(user1.userAddresses.get("Work").getFullAddress());

//case 2
        Map<String, Address> user2Addresses = new HashMap<>();
        user2Addresses.put("Work", address1);
        user2Addresses.put("Home", address2);

        User user2 = new User("hareaion@gmail.com", user2Addresses);
        System.out.println(user2.userId);
        System.out.println(user2.username);
        System.out.println(user2.userAddresses.get("Home").getFullAddress());

        user2.addAddress("Home", new Address("Moldova", "Balti", "Decebal"));

        List<Item> oreder1Items =new ArrayList<>();


    }
}

