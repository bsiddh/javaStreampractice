package com.streams.java;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Integer> arrayEleemnt = Arrays.asList(10,15,8,49,25,98,98,32,15);
       long value = arrayEleemnt.stream()
                .count();
//       System.out.println(value);

        int[] arr = {10,15,8,49,25,98,98,32,15};
       long values = Arrays.stream(arr)
                .boxed()
                .count();
        System.out.println(values);
    }
}
