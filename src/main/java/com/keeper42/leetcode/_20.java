package com.keeper42.leetcode;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/16
 */
public class _20 {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String str = sin.next();
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (!stack.isEmpty() && c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
