package com.streams.java;

import java.util.HashSet;
import java.util.*;

public class firstRepeatedCharacter {

    public static void main(String[] args) {
        String wordElement = "Stream api logical questions";
        Set<Character> setValue = new HashSet<>();
      char firstCharacter =  wordElement.chars()
                .mapToObj(n->(char)n)
                .filter(c->!setValue.add(c))
                .findFirst()
                .orElse(null);

      System.out.println(firstCharacter);
    }
}
