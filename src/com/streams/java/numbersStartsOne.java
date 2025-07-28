package com.streams.java;

import java.util.Arrays;
import java.util.List;

public class numbersStartsOne {

    public static void main(String[] args) {
//        List<Integer> valueOfEleemnt = Arrays.asList(10,15,8,49,25,98,32);
//        valueOfEleemnt.stream()
//                .map(s->s+"")
//                .filter(n->n.startsWith("1"))
//                .forEach(System.out::println);


        int[] arr = {10,15,8,49,25,98,32};
        Arrays.stream(arr)
                .boxed()
                .map(n->n+"")
                .filter(m->m.startsWith("1"))
                .forEach(System.out::println);
    }
}
