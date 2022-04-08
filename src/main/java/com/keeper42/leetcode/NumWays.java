package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/9
 * @type 青蛙跳
 */
public class NumWays {

    public int numWays(int n) {
        if(n <= 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        //dp[2] = 2;
        for(int i = 2; i < n+1; i++){
            dp[i] = (dp[i-1] + dp[i-2])%1000000007;
        }
        return dp[n];
    }

}
