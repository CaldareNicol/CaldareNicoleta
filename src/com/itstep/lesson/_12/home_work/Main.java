package com.itstep.lesson._12.home_work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Moldova", "Chisinau", "Decebal");
        Address address2 = new Address("Moldova", "Calarasi", "Biruintei");

        Map<String, Address> user1Addresses = new HashMap<>();
        user1Addresses.put("Work", address1);
        user1Addresses.put("Home", address2);

        User user2 = new User("hareaion@gmail.com", user1Addresses);
        System.out.println(user2.userId);
        System.out.println(user2.username);
        System.out.println(user2.userAddresses.get("Home").getFullAddress());

        user2.addAddress("Home", new Address("Moldova", "Balti", "Decebal"));

        List<Item> order1Items = new ArrayList<>();
    }
}
