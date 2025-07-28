package com.streams.java;

import java.util.*;

public class highestValue {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
      int maxValue = myList.stream()
               .max(Integer::compare)
               .get();
//      System.out.println(maxValue);

        int[] arr = {10,15,8,49,25,98,98,32,15};
        long values = Arrays.stream(arr)
                .boxed()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(values);
    }
}
