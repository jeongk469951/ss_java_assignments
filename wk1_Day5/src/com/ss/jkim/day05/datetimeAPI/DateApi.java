package com.ss.jkim.day05.datetimeAPI;

import java.security.Timestamp;
import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.zone.ZoneOffsetTransitionRule;


public class DateApi {

    public static void main(String[] args) {
        int year = 2021;
        lengthOfMonth(year);
    }

    /**
     * Question 1
     * LocalDateTime birthDay = LocalDateTime.of(1990, 11, 23, 9, 50, 20, 59);
     */

    /**
     * Question 2
     * Using date.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
     */

    /**
     * Question 3
     * ZoneOffset tracks only the absolute offset from Greenwich/UTC
     *
     */

    /**
     * Question 4
     * by using the ZonedDateTime.ofInstant method
     *
     * ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.now(),
     *                                             ZoneId.systemDefault());
     *
     * Instant inst = ZonedDateTime.now().toInstant();
     *
     */



    //Question 5
    public static void lengthOfMonth(int year) {

        for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            System.out.printf("%s: %d days%n", month, ym.lengthOfMonth());
        }

    }

    //Question 6
    public static void listAllMonday(Month month) {


        LocalDate date = Year.now().atMonth(month).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month mi = date.getMonth();
        while (mi == month) {
            System.out.printf("%s%n", date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
    }

    //Question 7
    public boolean  isFriday(LocalDate date){

        return (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13);

    }


}
