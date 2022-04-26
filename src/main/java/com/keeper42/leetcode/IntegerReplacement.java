package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/26
 */
public class IntegerReplacement {

    public int integerReplacement(int n) {
        return (int)func((long)n);
    }
    public long func(long n){
        if(n <= 1) {
            return 0;
        }
        if(n%2==0){
            return  1 + func(n>>1);
        } else {
            return 1 + Math.min(func(n+1),func(n-1));
        }
    }

}
