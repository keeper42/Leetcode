package com.keeper42.test;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lijiafanß
 * @version 1.0
 * @date 2022/3/5
 */
public class Test {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 1};

        List<int[]> ints = Arrays.asList(nums);
        Set<int[]> res = new HashSet<>(Arrays.asList(nums));
        System.out.println(res.stream().iterator().next().length);
        ;


        Set<Integer> set = new HashSet<>();
        set.add(Arrays.stream(nums).findAny().getAsInt());
        System.out.println(set);


        Set<Integer> set2 = new HashSet<>();
        for (int i : nums) {
            boolean flag = set2.add(i);
            if (!flag) {
                return;
            }
        }
        System.out.println(set2.size());
    }

}
