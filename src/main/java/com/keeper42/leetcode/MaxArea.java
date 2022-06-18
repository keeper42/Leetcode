package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/6/
 * @type leetcode 11. container with the most water
 * input：[1,8,6,2,5,4,8,3,7]
 * output：49
 */
public class MaxArea {

    public int maxArea(int[] a) {
        int max = 0;
        for(int i = 0, j = a.length - 1; i < j; ){
            int minHeight = a[i] < a[j] ? a[i++] : a[j--];
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }

}
