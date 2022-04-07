package com.keeper42.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/8
 */
public class InorderTraversal {

    public List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;
    }

}
