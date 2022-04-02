package com.keeper42.leetcode;

import java.util.*;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/5
 */
public class ZigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null) {
            List<Integer> rootVal = Arrays.asList(root.val);
            List<List<Integer>> res = new ArrayList<>();
            res.add(rootVal);
            return res;
        }

        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> tmp = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new LinkedList<>();
            while (count > 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count--;
            }
            tmp.add(list);
        }
        for (int i = 0; i < tmp.size(); i++) {
            if (i % 2 == 1) {
                List<Integer> subList = tmp.get(i);
                List<Integer> newList = new ArrayList<>();
                if (!subList.isEmpty()) {
                    for (int j = subList.size() - 1; j >= 0; j--) {
                        newList.add(subList.get(j));
                    }
                }
                res.add(newList);
            } else {
                res.add(tmp.get(i));
            }
        }
        return res;
    }
}
