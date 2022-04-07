package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/7
 * @type leetcode 70
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if (n == 1 || n == 2) { return n; }
        int i1 = 1, i2 = 2, res = 1;
        for (int i = 3; i <= n; i++) {
            res = i1 + i2;
            i1 = i2;
            i2 = res;
        }
        return res;
    }

}
