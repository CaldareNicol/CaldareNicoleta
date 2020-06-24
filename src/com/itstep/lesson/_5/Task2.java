package com.itstep.lesson._5;

public class Task2 {
    //Write a method that displays a horizontal or vertical line made of a symbol.
    // The method takes the following as parameters: line length, direction, symbol.
    static void lineDisplay(int num, char sym,int direction) {
        //1=vertical;
        // 2=horizontal;

        for (int i = 0; i < num; i++) {
            if (direction==1){
                System.out.println(sym);
            }else{
                System.out.print(sym);
            }
        }

    }

    public static void main(String[] args) {
        lineDisplay(6, '#',1);
    }
}
