package com.streams.java;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        int[] arrElement = {10,15,8,49,25,98,32};
        Map<Boolean,List<Integer>> valuesOfArray = Arrays.stream(arrElement)
                .boxed()
                .collect(Collectors.partitioningBy(n->n%3==0));
        System.out.println(valuesOfArray);
    }
}
