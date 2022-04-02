package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/4
 */
public class InverseInteger {

    public int reverse(int x) {
        StringBuffer res = new StringBuffer();
        String xstr = String.valueOf(x);
        int xstrlen = xstr.length();
        char minus = '-';
        if (xstr.charAt(0) == minus) {
            res.append(minus);
            for (int i = 0; i < xstrlen - 1; i++) {
                res.append(xstr.charAt(xstrlen - 1 - i));
            }
        } else {
            for (int i = 0; i < xstrlen; i++) {
                res.append(xstr.charAt(xstrlen - 1 - i));
            }
        }
        int result = 0;
        try {
            result = Integer.valueOf(String.valueOf(res));
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

}
