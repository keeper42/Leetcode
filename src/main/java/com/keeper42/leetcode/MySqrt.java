package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/7
 * @type leetcode 69
 */
public class MySqrt {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        for (int i = 0; i < x; i++) {
            //用x/i<i而不是i*i>x防止溢出
            if (x / (i+1) < (i+1)) {
                return i;
            }
        }
        return 1;
    }

}
