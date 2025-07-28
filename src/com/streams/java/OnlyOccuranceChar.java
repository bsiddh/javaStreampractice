package com.streams.java;

public class OnlyOccuranceChar {

    public static void main(String[] args) {
        String value = "Siddharth";
        value.chars()
                .mapToObj(c->(char)c)
                .filter(ch->value.indexOf(ch)==value.lastIndexOf(ch))
                .forEach(System.out::println);
    }
}
