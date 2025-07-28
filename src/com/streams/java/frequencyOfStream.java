package com.streams.java;

import java.util.*;

public class frequencyOfStream {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long value = myList.stream()
                .count();
        System.out.println(value);
    }
}
