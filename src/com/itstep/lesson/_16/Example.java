package com.itstep.lesson._16;

import java.time.LocalDate;
import java.time.LocalTime;

public class Example {
    public static void main(String[] args) throws InterruptedException {

        //        the day of the week I was born
        System.out.println( LocalDate.of(2000,03,27).getDayOfWeek());

        //apare text la fiecare secunda
        String txt="Hello";
        LocalTime end= LocalTime.now().plusSeconds(15);

        do {
            System.out.println(txt+LocalTime.now());
            Thread.sleep(1000);
        }while (LocalTime.now().isBefore(end));

    }
}
