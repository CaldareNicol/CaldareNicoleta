package com.itstep.lesson._12.home_work;

import java.util.List;

public  class UserOrder extends AbstractOrder {
//    private long orderId;
    private User orderUser;

    public UserOrder(long orderId, List<Item> orderItem) {
        super(orderId, orderItem);
    }

    public User getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(User orderUser) {
        this.orderUser = orderUser;
    }


//    private List<Item> orderItem;

//    public long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(long orderId) {
//        this.orderId = orderId;
//    }

//    public List<Item> getOrderItem() {
//        return orderItem;
//    }
//
//    public void setOrderItem(List<Item> orderItem) {
//        this.orderItem = orderItem;
//    }
//
//    public UserOrder(long orderId, User orderUser, List<Item> orderItem) {
//        Random random = new Random();
//        this.orderId = random.nextInt(10000);
//        this.orderUser = orderUser;
//        this.orderItem=orderItem;
//
//    }
//            List<Item> filteredByType (Type type){
//                List<Item> filteredItems = new ArrayList<>();
//
//                for (int i = 0; i < orderItem.size(); i++) {
//                    Item tempIn = (Item) orderItem.get(i);
//                    if (tempIn.getItemType().equals(Type.CLOTHES)) {
//                        filteredItems.add(tempIn);
//                    }
//                }
//
//                return filteredItems;
//            }
//
//    @Override
//    public double sum() {
//        double total = 0;
//        for (int i=0; i<orderItem.size();i++){
//            double itemPrice =orderItem.get(i).getPrice();
//            total+=itemPrice;
//        }
//
//        return total;
//    }
//
//    @Override
//    public double count() {
//        return orderItem.size();
//    }
}
