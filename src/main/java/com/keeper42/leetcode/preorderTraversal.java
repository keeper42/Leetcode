package com.keeper42.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/8
 * @type leetcode 144
 */
public class preorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            if(node==null) {
                continue;
            }
            res.add(node.val);
            stack.push(node.right);
            stack.push(node.left);
        }
        return res;
    }


}
