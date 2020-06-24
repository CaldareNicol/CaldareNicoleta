package com.itstep.lesson._12.practice;

public class Main {

    public static void main(String[] args) {

        Square square = new Square("Square", 5);
        System.out.println(square);

        Circle circle=new Circle("Circle",2);
        System.out.println(circle);

        Rectangle rectangle=new Rectangle("Rectangle",3,2);
        System.out.println(rectangle);
    }
}
