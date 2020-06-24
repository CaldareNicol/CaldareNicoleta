package com.itstep.lesson._12.home_work;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class AbstractUser {

    protected long userId;
    protected  String username;
   protected Map<String, Address> userAddresses;
//    protected List<Item> userAddress;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public Map<String, Address> getUserAddresses() {
        return userAddresses;
    }

    public void setUserAddresses(Map<String, Address> userAddresses) {
        this.userAddresses = userAddresses;
    }

//    public List<Item> getUserAddress() {
//        return userAddress;
//    }
//
//    public void setUserAddress(List<Item> userAddress) {
//        this.userAddress = userAddress;
//    }

    public AbstractUser(String username) {
        Random random = new Random();
        this.userId = random.nextInt(10000);
        this.username = username;
        this.userAddresses = new HashMap<String, Address>();
    }

    public void addAddress(String location, Address address) {
        userAddresses.put(location, address);
    }



}
