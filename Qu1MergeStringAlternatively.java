package com.bhuwan;

public class Qu1MergeStringAlternatively {

    public static void main(String[] args) {
        Qu1MergeStringAlternatively obj = new Qu1MergeStringAlternatively();
        System.out.println(obj.mergeAlternately("ab", "123456"));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        if(word1 == null && word2 != null) {
            return word2;
        }

        if(word2 == null && word1 != null) {
            return word1;
        }

        if(word1 != null && word1.isEmpty()) {
            return word2;
        }

        if(word2 !=  null && word2.isEmpty()) {
            return word1;
        }

        if(word1 == null && word2 == null) {
            return null;
        }

        String[] word1Array = word1.split("");
        String[] word2Array = word2.split("");

        if(word1Array.length >= word2Array.length){
            for(int i = 0; i < word1Array.length; i++) {
                result.append(word1Array[i]);
                if(i < word2Array.length) {
                    result.append(word2Array[i]);
                }
            }
        } else {
            for(int i = 0; i < word2Array.length; i++) {
                if(i < word1Array.length) {
                    result.append(word1Array[i]);
                }
                result.append(word2Array[i]);
            }
        }

         return  result.toString();
    }


}
