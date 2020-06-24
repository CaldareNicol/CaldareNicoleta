package com.itstep.lesson._12.practice;

public class Square extends Shape{

   protected double length;

    public Square(String name,double length) {
        super(name);
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                '}'+ getInformation();
    }


}
