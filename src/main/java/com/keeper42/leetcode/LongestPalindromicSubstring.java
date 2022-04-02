package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/3
 * @type leetcode 5
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "ksfjgfkjjjggjgjg";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int[] pos = new int[]{0, 0};
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            i = findLongest(str, i, pos);
        }
        return s.substring(pos[0], pos[1] + 1);
    }

    public static int findLongest(char[] str, int low, int[] pos) {
        int high = low;
        while (high < str.length - 1 && str[high + 1] == str[low]) {
            high++;
        }
        int res = high;
        while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
            low--;
            high++;
        }
        if (high - low > pos[1] - pos[0]) {
            pos[0] = low;
            pos[1] = high;
        }
        return res;
    }

}
