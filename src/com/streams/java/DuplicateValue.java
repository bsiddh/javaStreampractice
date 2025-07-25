package com.streams.java;

import java.util.*;

public class DuplicateValue {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        myList.stream()
                .filter(n->!set.add(n))
                .forEach(System.out::println);
    }
}
