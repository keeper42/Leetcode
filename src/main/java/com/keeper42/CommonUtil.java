package com.keeper42;

import java.util.Scanner;

/**
 * @author lijiafan
 */
public class CommonUtil {

    public static Integer inputAInteger() {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        return Integer.parseInt(next);
    }

    public static Double inputADouble() {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        return Double.valueOf(next);
    }

    public static int[] inputIntInLine() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] numstr = str.split(" ");
        int[] nums = new int[numstr.length];
        for (int i = 0; i < numstr.length; i++) {
            nums[i] = Integer.parseInt(numstr[i]);
        }
        return nums;
    }

    public static void traversal(Object[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

}
