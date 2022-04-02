package com.keeper42.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/13
 * @type leetcode 39
 */
public class CombinationSum {


    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 6, 7};
        int tag = 7;
        List<List<Integer>> lists = combinationSum(arr, tag);
        System.out.println(lists);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> listAll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        find(listAll, list, candidates, target, 0);
        return listAll;
    }


    public static void find(List<List<Integer>> list, List<Integer> tmp, int[] candidates, int target, int num) {
        if (target == 0) {
            listAdd(list, tmp, target);
            return;
        }
        if (target < candidates[0]) {
            return;
        }
        for (int i = num; i < candidates.length && candidates[i] <= target; i++) {
            List<Integer> sub = new ArrayList<>(tmp);
            sub.add(candidates[i]);
            find(list, sub, candidates, target - candidates[i], i);
        }
    }

    public static void listAdd(List<List<Integer>> list, List<Integer> tmp, int target) {
        if (sum(tmp) == target) {
            List<Integer> sub = new ArrayList<>(tmp);
            list.add(sub);
        }
    }

    public static int sum(List<Integer> tmp) {
        return tmp.stream().mapToInt(o -> o).sum();
    }

//    public static List<List<Integer>> find(List<List<Integer>> listAll, List<List<Integer>> list, int[] candidates, int target, int num) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> tmp = new ArrayList<>();
//        int len = candidates.length;
//        if (candidates[len-1] == target) {
//            tmp.add(candidates[len-1]);
//            resAddTmp(res,tmp,target);
//        }
//        for (int i = 0; i < len-1; i++) {
//            if (candidates[i] <= target) {
//                tmp.add(candidates[i]);
//                resAddTmp(res,tmp,target);
//            }
//            for (int j = i+1; j < len; j++) {
//                if (sum(tmp) + candidates[j] <= target) {
//                    tmp.add(candidates[j]);
//                    resAddTmp(res,tmp,target);
//                }
//            }
//            tmp.clear();
//        }
//        return res;
//    }


}
