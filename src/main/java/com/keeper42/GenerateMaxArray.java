package com.keeper42;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/2/26
 * @from 《Coding Interview Guide》 Page19
 * <p>
 * input: a slide window size and an integer array of length n
 * output: an array which lenth is (n-w+1), array[i] is the max value of any window.
 * e.g. input: 3 [4 3 5 4 3 3 6 7], output:[5 5 5 4 6 7]
 * </p>
 */
public class GenerateMaxArray {

    public static void main(String[] args) {
        Integer num = CommonUtil.inputAInteger();
        int[] nums = CommonUtil.inputIntInLine();
        Object[] maxArray = getMaxArray(num, nums);
        CommonUtil.traversal(maxArray);
    }

    private static Object[] getMaxArray(Integer w, int[] arr) {
        if (w < 1 || w > arr.length) {
            return new Object[0];
        }
        List<Integer> list = new ArrayList<>(w);
        Integer[] result = new Integer[arr.length - w + 1];
        for (int i = 0; i < arr.length - w + 1; i++) {
            for (int j = i; j < i + w; j++) {
                list.add(arr[j]);
            }
            Integer maxValue = list.stream().max(Comparator.comparingInt(o -> o)).get();
            list.clear();
            result[i] = maxValue;
        }
        return result;
    }

}
