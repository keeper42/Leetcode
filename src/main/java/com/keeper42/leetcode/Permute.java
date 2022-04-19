package com.keeper42.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/19
 * @type 46. 全排列
 *
 * <p>
 * result = []
 * def backtrack(路径, 选择列表):
 *
 *     if 满足结束条件:
 *         result.add(路径)
 *         return
 *
 *     for 选择 in 选择列表:
 *         做选择
 *         backtrack(路径, 选择列表)
 *         撤销选择
 * </p>
 */
public class Permute {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        backtrack(res, sub, nums);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> sub, int[] nums) {
        if(sub.size() == nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(!sub.contains(nums[i])) {
                sub.add(nums[i]);
                backtrack(res, sub, nums);
                sub.remove(sub.size() - 1);
            }
        }
    }

}
