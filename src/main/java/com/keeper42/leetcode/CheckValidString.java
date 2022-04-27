package com.keeper42.leetcode;

// 解答错误

import java.util.Stack;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/27
 */
public class CheckValidString {

    public static void main(String[] args) {
        String s = "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()";
        System.out.println(checkValidString(s));;
    }


    public static boolean checkValidString(String s) {
        if (s == null) {
            return true;
        }
        String ss = s.replace(" ", "");
        if (ss == null || ss.length() == 0) {
            return true;
        }
        String s0 = s.replace("*", "");
        if (s0 == null || s0.length() == 0) {
            return true;
        }
        if (characterStack(s0).isEmpty()) {
            return true;
        }

        String s1 = s.replace('*', '(');
        if (characterStack(s1).isEmpty()) {
            return true;
        }

        String s2 = s.replace('*', ')');
        if (characterStack(s2).isEmpty()) {
            return true;
        }

        return false;
    }

    public static Stack<Character> characterStack(String s0) {
        Stack<Character> cstack0 = new Stack<>();
        char[] chars0 = s0.toCharArray();
        for (int i = 0; i < chars0.length; i++) {
            if (chars0[i] == '(') {
                cstack0.push(chars0[i]);
            } else if (chars0[i] == ')') {
                if (!cstack0.isEmpty()) {
                    cstack0.pop();
                } else {
                    cstack0.push(chars0[i]);
                    return cstack0;
                }
            } else {
                chars0[i]='(';
                cstack0.push(chars0[i]);
                //characterStack(s0, sub, list);
                cstack0.pop();

                chars0[i]=')';
                cstack0.push(chars0[i]);
                //characterStack(s0, sub, list);
                cstack0.pop();

                chars0[i]='*';
            }
        }
        return cstack0;
    }

}
