package com.bhuwan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qu3 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};

        int extraCandies = 3;
        List<Boolean> result = new ArrayList<Boolean>();

        int max =  Arrays.stream(arr).max().getAsInt();
        Arrays.stream(arr).forEach(e -> {
            if(e+extraCandies >= max) result.add(true);
            else result.add(false);
        });
        System.out.println(result);

    }
}
