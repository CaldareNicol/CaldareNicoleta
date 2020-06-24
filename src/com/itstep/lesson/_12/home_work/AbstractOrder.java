package com.itstep.lesson._12.home_work;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractOrder {

    protected long orderId;
    protected List<Item> orderItem;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }


    public List<Item> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<Item> orderItem) {
        this.orderItem = orderItem;
    }

    public AbstractOrder(long orderId, List<Item> orderItem) {
        this.orderId = orderId;
        this.orderItem = orderItem;
    }

    List<Item> filteredByType (Type type){
        List<Item> filteredItems = new ArrayList<>();

        for (int i = 0; i < orderItem.size(); i++) {
            Item tempIn = (Item) orderItem.get(i);
            if (tempIn.getItemType().equals(Type.CLOTHES)) {
                filteredItems.add(tempIn);
            }
        }
        return filteredItems;
    }
    public double sum() {
        double total = 0;
        for (int i=0; i<orderItem.size();i++){
            double itemPrice =orderItem.get(i).getPrice();
            total+=itemPrice;
        }

        return total;
    }
    public double count() {
        return orderItem.size();
    }
}
