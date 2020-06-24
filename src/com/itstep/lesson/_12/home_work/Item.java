package com.itstep.lesson._12.home_work;

import java.util.Random;

public class Item {
    private Type itemType;
    private long itemId;
    private String itemTitle;
    private double price;

    public Type getItemType() {
        return itemType;
    }

    public void setItemType(Type itemType) {
        this.itemType = itemType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item() {

    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }


    public Item(String title, Type type, double price) {
        this.price = price;
        Random random = new Random();
        this.itemId = random.nextInt(10000);
        this.itemTitle = title;
        this.itemType = type;
    }

    public void infoItem() {
        System.out.println("Id item " + itemId + ", the title of item " + itemTitle + " and type " + itemType);
    }

//    public static void main(String[] args) {
//        Collection<String> listItem = new LinkedList<String>();
//
//        listItem.add("Dress");
//        listItem.add("shirt");
//        listItem.add("phone");
//        System.out.println(listItem);
//    }
}
