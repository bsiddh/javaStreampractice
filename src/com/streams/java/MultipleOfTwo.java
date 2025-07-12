package com.streams.java;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOfTwo {
    public static void main(String[] args) {
        int[] arrayValues = {10,15,8,49,25,98,32};
        Map<Boolean,List<Integer>> listValue = Arrays.stream(arrayValues)
                .boxed()
                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(listValue);
    }
}
