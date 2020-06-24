package com.itstep.lesson._12.home_work;

import java.util.Map;

public class User extends AbstractUser {

    public User(String username, Map<String, Address> user1Addresses) {
        super(username);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userAddresses=" + userAddresses +
                '}';
    }
}

