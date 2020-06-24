package com.itstep.lesson._12.practice;

public abstract class Shape implements InterfaceShapes {

    protected String name;

     public String getInformation() {
        return "\n The Perimeter of the "+ name+" is: "+ getPerimeter()+
                "\n The Area of the "+ name+" is: "+ getArea();
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
