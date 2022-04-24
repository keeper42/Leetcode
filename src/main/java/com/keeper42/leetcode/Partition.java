package com.keeper42.leetcode;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/24
 */
public class Partition {

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        if (s==null || s.length()==0) {
            return new ArrayList<>();
        }
        List<String> sub = new ArrayList<>();
        if (s.length() == 1) {
            sub.add(s);
            res.add(sub);
            return res;
        }

        // if (s.length() == 2) {
        //     boolean flag = isPalindrome(s);
        //     if (flag) {
        //         sub.add(s);
        //         res.add(sub);
        //         sub.remove(s);

        //     }
        //     sub.add(s.substring(0,1));
        //     sub.add(s.substring(1,2));
        //     res.add(sub);
        //     return res;
        // }
        // "aabab"
        // recursion(s);
        dfs(s,0, new ArrayList<String>(), res);
        return res;
    }

    // 经典回溯法
    private void dfs(String s, int start, ArrayList<String> sub, List<List<String>> list) {
        if (start == s.length()) {
            list.add(new ArrayList<>(sub));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            String s1 = s.substring(start, i + 1);
            if (!isPalindrome(s1)) {
                continue;
            }
            sub.add(s1);
            dfs(s,i + 1, sub, list);
            sub.remove(sub.size() - 1);
        }
    }

    private boolean recursion(String s) {
        if (!isPalindrome(s)) {
            return false;
        }
        List<String> sub = new ArrayList<>();
        if (s.length() == 1) {
            sub.add(s);
            return true;
        }
        if (s.length() == 2) {
            if (isPalindrome(s)) {
                sub.add(s);
                return true;
            } else {
                return false;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            String substr1 = s.substring(0, i+1);
            String substr2 = s.substring(i+1);
            boolean flag1 = recursion(substr1);
            boolean flag2 = recursion(substr2);
            if (flag1 && flag2) {
                sub.add(substr1);
                sub.add(substr2);
                List<String> copy = new ArrayList<>(sub);
                res.add(copy);
            } else {
                sub.clear();
            }
        }
        return true;
    }

    private boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
