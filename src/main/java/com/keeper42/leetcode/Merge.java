package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/7
 * @type leetcode 88. 合并两个有序数组
 */
public class Merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m < 0 || n < 0 || m+n < 1) {
            return;
        }
        int last = m+n-1;
        while (n>0) {
            if (m==0 || (nums1[m-1] <= nums2[n-1])) {
                nums1[last--] = nums2[--n];
            } else {
                nums1[last--] = nums1[--m];
            }
        }
    }

}
