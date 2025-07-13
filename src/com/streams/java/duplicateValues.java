package com.streams.java;

import java.util.*;
import java.util.stream.Collectors;

public class duplicateValues {

    public boolean reOccuredValues(int[] num){
        List<Integer> valueOfList = Arrays.stream(num)
                .boxed()
                .collect(Collectors.toList());

        Set<Integer> arrayValues = new HashSet<>(valueOfList);
        if(arrayValues.size()==valueOfList.size()){
            return  false;
        }
        return  true;
//return Arrays.stream(num)
//        .anyMatch(n->!arrayValues.add(n));

    }


    public static void main(String[] args) {
        int[] arrElement = {10,15,8,49,25,98,32,15};
        duplicateValues values = new duplicateValues();
        System.out.println(values.reOccuredValues(arrElement));

    }
}
