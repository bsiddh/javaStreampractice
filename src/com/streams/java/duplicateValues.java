package com.streams.java;

import java.util.*;

public class duplicateValues {

    public boolean reOccuredValues(int[] num){
        Set<Integer> arrayValues = new HashSet<>();
return Arrays.stream(num)
        .anyMatch(n->!arrayValues.add(n));
    }

    public static void main(String[] args) {
        int[] arrElement = {10,15,8,49,25,98,98,32,15};
        duplicateValues values = new duplicateValues();
        System.out.println(values.reOccuredValues(arrElement));

    }
}
