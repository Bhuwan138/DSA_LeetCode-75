package com.bhuwan;

public class Qu9 {
    public static void main(String[] args) {
        Qu9 solution = new Qu9();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(solution.compress(chars));
    }

    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }
            chars[index++] = chars[i];
            if (j - i > 1) {
                String count = j - i + "";
                for (char c : count.toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = j;
        }
        return index;
    }
}

