package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/20
 * @type 124. 二叉树中的最大路径和
 */
public class MaxPathSum {

    int ret = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getSum(root);
        return ret;
    }

    private int getSum(TreeNode r) {
        if (r == null) {
            return 0;
        }
        int left = Math.max(0, getSum(r.left));
        int right = Math.max(0, getSum(r.right));
        ret = Math.max(ret, left + r.val + right);
        return r.val + Math.max(left, right);
    }

}
