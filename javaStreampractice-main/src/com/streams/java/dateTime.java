package com.streams.java;

public class dateTime {

    public static void main(String[] args) {
        System.out.println("Final output");
        System.out.println("Local time today"+" " +java.time.LocalTime.now());
        System.out.println("Today Date"+" "+java.time.LocalDate.now());
        System.out.println("Today Date And Time"+" "+java.time.LocalDateTime.now());
    }
}
