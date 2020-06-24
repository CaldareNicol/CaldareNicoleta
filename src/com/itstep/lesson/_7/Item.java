package com.itstep.lesson._7;

import java.util.*;

public class Item{
    public long itemId;
    public String itemTitle;
    public Type itemType;

    public Item(String title, Type type) {
        Random random= new Random();
        this.itemId = random.nextInt(10000);
        this.itemTitle = title;
        this.itemType = type;
    }

    public void setItemType(Type itemType) {
        this.itemType = itemType;
    }

//    public Item(String title, Type type, double price) {
//        super(title, type, price);
//    }


    public Item(long itemId, String itemTitle, Type itemType) {
        this.itemId = itemId;
        this.itemTitle = itemTitle;
        this.itemType = itemType;
    }

    public void infoItem(){
        System.out.println("Id item " + itemId + ", the title of item "+ itemTitle + " and type " + itemType);
    }

    public static void main(String[] args) {
        Collection<String> listItem = new LinkedList<String>();

        listItem.add("Dress");
        listItem.add("shirt");
        listItem.add("phone");
        System.out.println(listItem);
    }
    
}
