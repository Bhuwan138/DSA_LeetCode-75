package com.bhuwan;

import java.util.Arrays;

public class Qu7 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        Qu7 obj = new Qu7();
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums){
        int[] prefixProduct = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i == 0){
                prefixProduct[i] = nums[i];
            }else {
                prefixProduct[i] = nums[i] * prefixProduct[i - 1];
            }
        }

        int[] suffixProduct = new int[nums.length];
        for(int i= nums.length-1;i>=0;i--){
            if(i == nums.length-1){
                suffixProduct[i] = nums[i];
            }else {
                suffixProduct[i] = nums[i] * suffixProduct[i + 1];
            }
        }

        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i == 0){
                result[i] = suffixProduct[i+1];
            } else if(i == nums.length-1){
                result[i] = prefixProduct[i-1];
            } else {
                result[i] = prefixProduct[i-1]*suffixProduct[i+1];
            }
        }

        return result;

    }
}
