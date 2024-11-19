package com.bhuwan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Qu6 {
    public static void main(String[] args) {
        String s = "a good   example";
        Qu6 obj = new Qu6();
        System.out.println(obj.reverse(s));
    }

    public String reverse(String s){
         List<String> resultList = new java.util.ArrayList<>(Arrays
                 .stream(s.split(" "))
                 .map(String::trim)
                 .filter(e -> !e.isEmpty())
                 .toList());
        System.out.println(resultList);
        Collections.reverse(resultList);
        return resultList.stream().collect(Collectors.joining(" "));
    }
}
