package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/4
 */
public class myPow {

    public static void main(String[] args) {
        double v = myPow(2, -2);
        System.out.println(v);
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1.0 / x;
        }
        if (n == -2) {
            return 1.0 / x * x;
        }
        double res = 1.0;
        for (int i = n; i != 0; i >>= 1) {
            if (i % 2 == 1) {
                res *= x;
            }
            x *= x;
        }
        return n < 0 ? 1 / res : res;
    }

}
