package com.keeper42.leetcode;

import com.keeper42.CommonUtil;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/7
 * @type 215. 数组中的第K个最大元素
 */
public class FindKthLargest {

    public static void main(String[] args) {
        int[] ints = CommonUtil.inputIntInLine();
        int kthLargest = findKthLargest(ints, 2);
        System.out.println(kthLargest);
    }

    public static int findKthLargest(int[] nums, int k) {
        Integer ints[] = new Integer [nums.length];
        for(int i=0; i<nums.length; i++){
            ints[i]= new Integer(nums[i]);
        }
        Arrays.sort(ints, Collections.reverseOrder());
        CommonUtil.traversal(ints);
        return ints[k-1];
    }

}
