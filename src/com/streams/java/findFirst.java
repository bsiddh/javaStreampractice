package com.streams.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findFirst {

    public static void main(String[] args) {
//        int[] arr = {10,15,8,49,25,98,98,32,15};
//        Arrays.stream(arr)
//                .boxed()
//                .findFirst()
//               .ifPresent(System.out::print);

        List<Integer> arrayEleemnt = Arrays.asList(10,15,8,49,25,98,98,32,15);
        arrayEleemnt.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
