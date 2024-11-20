package com.bhuwan;

public class Qu8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(solution.increasingTriplet(nums));

    }
}

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        for(int num: nums){
            if(num <= num1 ||num <=num2) continue;
            else return true;
        }
        return false;

    }
}