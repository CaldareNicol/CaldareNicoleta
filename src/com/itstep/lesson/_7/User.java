package com.itstep.lesson._7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class User {
    public static long idCounter=0L;
    public long userId;
    public String username;
    public Map<String, Address> userAddresses;
    public List<Item> userAddres;

// case1
    public User(String username) {
     //   Random random=new Random();
        //        this.userId = random.nextInt(10000);
        this.username = username;
        this.userAddresses = new HashMap<>();
        this.userId=idCounter++;
    }

 //case2
 public User(String username, Map<String, Address>userAddresses) {
     Random random = new Random();
     this.userId = random.nextInt(10000);
     this.username = username;
     this.userAddresses = userAddresses;
 }
 public void addAddress(String location, Address address){
        userAddresses.put(location,address);
 }

}
