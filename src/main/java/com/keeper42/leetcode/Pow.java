package com.keeper42.leetcode;

import static com.keeper42.CommonUtil.inputADouble;
import static com.keeper42.CommonUtil.inputAInteger;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/4
 * @type leetcode 50 pow(x,n)
 */
public class Pow {

    public static void main(String[] args) {
        Double x = inputADouble();
        Integer n = inputAInteger();
        double res = myPow(x, n);
        System.out.println(res);
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1.0/x;
        }
        if (n == -2) {
            return 1.0 / (x*x);
        }
        double res = 1.0;
        for(int i = n; i != 0; i /= 2){
            if(i % 2 != 0){
                res *= x;
            }
            x *= x;
        }

        return  n < 0 ? 1 / res : res;
    }

}
