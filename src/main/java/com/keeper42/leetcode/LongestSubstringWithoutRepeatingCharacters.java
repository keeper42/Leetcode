package com.keeper42.leetcode;

import java.util.*;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/3
 * @type leetcode 3
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "abcabcbb";
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        List<Integer> sizeList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            addSizeList(s.substring(i), sizeList);
        }
        System.out.println((sizeList.isEmpty()) ? 0
                : sizeList.stream().max(Comparator.comparingInt(e -> e)).get());
    }

    public static void addSizeList(String s, List<Integer> sizeList) {
        Set<Character> charSet = new HashSet<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!charSet.contains(chars[i])) {
                charSet.add(chars[i]);
            } else {
                sizeList.add(charSet.size());
                charSet.clear();
            }
        }
        if (!charSet.isEmpty()) {
            sizeList.add(charSet.size());
        }
    }

}
