package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/5/22
 */
public class StringMultiply {

    public String multiply(String num1, String num2) {
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        if(n1 < 0 || n2 < 0) {
            return "";
        }
        int[] mul = new int[n1+n2+2];

        for(int i = n1; i >= 0; --i) {
            for(int j = n2; j >= 0; --j) {
                int bitmul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                bitmul += mul[i+j+1];
                mul[i+j] += bitmul / 10;
                mul[i+j+1] = bitmul % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < mul.length; ++i) {
            if (mul[i] == 0) {
                continue;
            }
            sb.append(mul[i]);
        }
        return sb.toString();

    }

}
