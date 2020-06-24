package com.itstep.lesson._16;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class T1 {
    public static void main(String[] args) {

    }


    //Write a method to get the last LocalDate of the month from a LocalDateTime.
    public void getTheLastLocalDate() {
        System.out.println(LocalDateTime.of(2020, 03, 27, 22, 19).with(TemporalAdjusters.lastDayOfMonth()));
    }

    //Write a method to get the last day of the current month.
    public void getTheLastDay() {
        System.out.println(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));
    }

    //Write a method to get difference of days between 2 dates
    public void getDifferenceOfDays() {
        LocalDate start = LocalDate.of(2003, 03, 27);
        LocalDate end = LocalDate.now();
        //        System.out.println( Duration.between(end,start).toDays());
//        System.out.println(  Period.between(start,end).getDays());
        long noOfDaysBetween = ChronoUnit.DAYS.between(start, end);
        System.out.println(noOfDaysBetween);
    }

    //Write a method to get the seconds between two LocalTime’s
    public void getSecondBetween() {
        LocalTime start2 = LocalTime.of(22, 17, 52);
        LocalTime end2 = LocalTime.of(22, 17, 54);
        System.out.println(Duration.between(start2, end2).getSeconds());
    }


    //Write a method to get the LocalDate of Monday from current date
    public void getLocalDateOfMonday() {
        LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    }


    //Write a method that will print the LocalDateTime like: 2020/Jan/01 2PM:02:59
    public void printLocalDateTimeLike() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd ha:mm:ss");
        LocalDateTime myTime = LocalDateTime.of(2018, 03, 8, 6, 3, 43);
        System.out.println(formatter.format(LocalDateTime.now()));
        System.out.println(formatter.format(myTime));
    }
}
