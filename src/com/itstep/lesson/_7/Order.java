package com.itstep.lesson._7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    public long orderId;
    public User orderUser;
    public List<Item> orderItem;


    public Order(User user, List<Item> orderItem) {
        Random random = new Random();
        this.orderId = random.nextInt(10000);
        this.orderUser = user;
        this.orderItem = orderItem;
    }

    List<Item>filteredByType(Type type){
        List<Item>filteredItems=new ArrayList<>();

        for (int i=0; i<orderItem.size();i++){
            Item tempInt= orderItem.get(i);
            if (tempInt.itemType.equals(Type.CLOTHES)){
                filteredItems.add(tempInt);
            }
        }

        return filteredItems;
    }



    public static void main(String[] args) {

    }
}
