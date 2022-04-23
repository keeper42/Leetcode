package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/23
 */
public class maxProfit {

    public int maxProfit(int[] prices) {
        int ans = 0;
        for(int i = 1; i < prices.length; i++){
            ans += Math.max((prices[i] - prices[i - 1]), 0);
        }
        return ans;
    }

}
