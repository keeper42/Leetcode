package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/9
 * @type leetcode fib
 */
public class Fib {

    public int fib(int n) {
        if (n==0 || n==1) {
            return n;
        }
        int sum = 1, tmp = 0;
        for (int i = 1; i < n; i++) {
            sum += tmp;
            tmp = sum - tmp;
            sum %= 1000000007;
        }
        return sum;
    }

}


