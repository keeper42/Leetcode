package com.keeper42.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/4
 * @type leetcode 6
 * <p>
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * </p>
 */
public class ZTransform {

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int num = 3;
        String result = convert(str, num);
        System.out.println(result);
    }

    public static String convert(String s, int numRows) {
        if (s.length() == 0) {
            return null;
        }
        if (s.length() == 1 || s.length() == 2) {
            return s;
        }
        if (numRows == 1) {
            return s;
        }
        StringBuilder res = new StringBuilder();
        int len = s.length();
        char[][] charMatrix = new char[numRows][len];
        for (char[] chars : charMatrix) {
            Arrays.fill(chars, '0');
        }
        char[] chars = s.toCharArray();
        Stack<Character> charStack = new Stack<>();
        int i = 0;
        for (i = len - 1; i >= 0; i--) {
            charStack.push(chars[i]);
        }

        int j = 0, k = 0;
        if (!charStack.isEmpty()) {
            charMatrix[0][0] = charStack.pop();
        }
        for (j = 0; j < s.length(); ) {
            for (k = 1; k < numRows; k++) {
                if (!charStack.isEmpty()) {
                    charMatrix[k][j] = charStack.pop();
                }
            }
            for (i = 1; i < numRows; i++) {
                if (!charStack.isEmpty()) {
                    charMatrix[k - 1 - i][j + i] = charStack.pop();
                }
            }
            j = j + i - 1;
        }

        for (i = 0; i < numRows; i++) {
            for (j = 0; j < s.length(); j++) {
                if (charMatrix[i][j] != '0') {
                    res.append(charMatrix[i][j]);
                }
            }
        }

        return res.toString();
    }


}
