package com.itstep.lesson._12.practice;

public class Rectangle extends Square{

    private double width;

    public Rectangle(String name, double length,double width) {
        super(name, length);
        this.width=width;

    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length+width);
    }

    @Override
    public double getArea() {
        return super.length* this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}'+getInformation();
    }
}
