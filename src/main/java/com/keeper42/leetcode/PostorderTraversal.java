package com.keeper42.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/8
 * @type leetcode 145
 */
public class PostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.peek();
            if(node==null) {
                continue;
            }
            stack.push(node.right);
            stack.push(node.left);
            stack.pop();
            res.add(node.val);
        }
        return res;
    }

}
