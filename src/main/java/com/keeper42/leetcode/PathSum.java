package com.keeper42.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/22
 */
public class PathSum {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return res;
        }
        if (root.val == targetSum && root.right == null && root.left == null) {
            List<Integer> sub = new ArrayList<>();
            sub.add(root.val);
            res.add(sub);
            return res;
        }
        List<Integer> sub = new ArrayList<>();
        path(root, targetSum, sub);
        return res;
    }

    private void path(TreeNode node, int targetSum, List<Integer> sub) {
        if (node == null) {
            return;
        }
        if (node.left==null && node.right==null && targetSum == node.val) {
            sub.add(node.val);
            // List<Integer> copy = sub;
            res.add(new ArrayList(sub));
            sub.remove(sub.size()-1);
            return;
        }
        sub.add(node.val);
        path(node.left, targetSum - node.val, sub);
        path(node.right, targetSum - node.val, sub);
        if (sub.size() > 0) {
            sub.remove(sub.size()-1);
        }

    }

}
