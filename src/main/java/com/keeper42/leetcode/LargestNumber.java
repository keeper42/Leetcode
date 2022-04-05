package com.keeper42.leetcode;


import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/4
 * @type 179
 * <p>
 *     给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * </p>
 */
public class LargestNumber {

    public static String largestNumber(int[] nums) {
        List<String> list = Arrays.asList(ArrayUtils.toStringArray(ArrayUtils.toObject(nums)));
        Collections.sort(list, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        String res = String.join("", list);
        if (res.charAt(0) == '0') {
            res = "0";
        }
        return res;
    }

}
