package com.bhuwan;

public class Qu5 {
    public static void main(String[] args) {
        Qu5 obj = new Qu5();
        System.out.println(obj.reverseVowels("leetcode"));
    }
    public String reverseVowels(String s) {
        char[] sArray = s.toCharArray();
        int start = 0, end = s.length()-1;
        while (start < end){
            while(start <end && !checkVowel(sArray[start])){
                start++;
            }
            while(start <end && !checkVowel(sArray[end])){
                end--;
            }

            if(start < end){
                char temp = sArray[start];
                sArray[start] = sArray[end];
                sArray[end] = temp;
                start++;
                end--;
            }
        }

        return new String(sArray);

    }

    private boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
