package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/20
 * @type 96. 不同的二叉搜索树
 */
public class NumTrees {

    public int numTrees(int n) {
        // C(2n,n) / (n+1)
        // G(n) = G(0)*G(n-1)+G(1)*(n-2)+...+G(n-1)*G(0)
        int[] Catalan = new int[n+1];
        Catalan[0] = 1;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; j++) {
                Catalan[i + 1] = Catalan[i + 1] + Catalan[j] * Catalan[i - j];
            }
        }
        return Catalan[n];
    }

}
