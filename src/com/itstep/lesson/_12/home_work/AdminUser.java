package com.itstep.lesson._12.home_work;

public class AdminUser extends AbstractUser {

    public AdminUser(String username) {
        super(username);
    }

    protected void rejectOrder(Order order){
        System.out.println("The order was rejected");
    }

    protected void approveOrder(Order order){
        System.out.println("The order was approved");
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userAddresses=" + userAddresses +
                '}';
    }
}
