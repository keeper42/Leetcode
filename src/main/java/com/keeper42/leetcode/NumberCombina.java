package com.keeper42.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/4
 */
public class NumberCombina {

    public static void main(String[] args) {
        letterCombinations("23");
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        String[][] strings = new String[][]{
                new String[]{" "},
                new String[]{"a", "b", "c"},
                new String[]{"d", "e", "f"},
                new String[]{"g", "h", "i"},
                new String[]{"j", "k", "l"},
                new String[]{"m", "n", "o"},
                new String[]{"p", "q", "r", "s"},
                new String[]{"t", "u", "v"},
                new String[]{"w", "x", "y", "z"}
        };
        char[] numbers = digits.toCharArray();
        if (numbers.length == 1) {
            Integer d = Integer.valueOf(digits);
            return Arrays.asList(strings[d]);
        }

        List<String> res = new ArrayList<>();
        if (numbers.length == 2) {
            String[] strs1 = strings[numbers[0] - '0'];
            String[] strs2 = strings[numbers[1] - '0'];
            for (int i = 0; i < strs1.length; i++) {
                for (int j = 0; j < strs2.length; j++) {
                    res.add(strs1[i] + strs2[j]);
                }
            }
            return res;
        }
        if (numbers.length == 3) {
            String[] strs1 = strings[numbers[0] - '0'];
            String[] strs2 = strings[numbers[1] - '0'];
            String[] strs3 = strings[numbers[2] - '0'];
            for (int i = 0; i < strs1.length; i++) {
                for (int j = 0; j < strs2.length; j++) {
                    for (int k = 0; k < strs3.length; k++) {
                        res.add(strs1[i] + strs2[j] + strs3[k]);
                    }
                }
            }
            return res;
        }
        if (numbers.length == 4) {
            String[] strs1 = strings[numbers[0] - '0'];
            String[] strs2 = strings[numbers[1] - '0'];
            String[] strs3 = strings[numbers[2] - '0'];
            String[] strs4 = strings[numbers[3] - '0'];
            for (int i = 0; i < strs1.length; i++) {
                for (int j = 0; j < strs2.length; j++) {
                    for (int k = 0; k < strs3.length; k++) {
                        for (int l = 0; l < strs4.length; l++) {
                            res.add(strs1[i] + strs2[j] + strs3[k] + strs4[l]);
                        }
                    }
                }
            }
            return res;
        }
        return null;
    }

}
