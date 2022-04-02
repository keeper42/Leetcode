package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/4
 * @type leetcode 8
 */
public class String2Integer {

    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int i = 0;
        while (i < len && chars[i] == ' ') {
            i++;
        }
        if (i == len) {
            return 0;
        }
        boolean negative = false;
        if (chars[i] == '-') {
            negative = true;
            i++;
        } else if (chars[i] == '+') {
            i++;
        } else if (!Character.isDigit(chars[i])) {
            return 0;
        }
        int ans = 0;
        while (i < len && Character.isDigit(chars[i])) {
            int digit = chars[i] - '0';
            // oom
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            i++;
        }
        return negative ? -ans : ans;
    }

}
