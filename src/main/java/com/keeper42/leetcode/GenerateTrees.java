package com.keeper42.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/21
 */
public class GenerateTrees {



    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (n==1) {
            list.add(new TreeNode(1));
            return list;
        } else if (n==2) {
            TreeNode node1 = new TreeNode(1);
            TreeNode node2 = new TreeNode(2);
            node1.right = node2;
            list.add(node1);
            node1 = new TreeNode(1);
            node2 = new TreeNode(2);
            node2.left = node1;
            list.add(node2);
            return list;
        } else if (n==3) {
            TreeNode node1 = new TreeNode(1);
            TreeNode node2 = new TreeNode(2);
            TreeNode node3 = new TreeNode(3);
            node2.left = null;
            node2.right = node3;
            node1.left = null;
            node1.right = node2;
            list.add(node1);

            node1 = new TreeNode(1);
            node2 = new TreeNode(2);
            node3 = new TreeNode(3);
            node3.left = node2;
            node3.right = null;
            node1.left = null;
            node1.right = node3;
            list.add(node1);

            node1 = new TreeNode(1);
            node2 = new TreeNode(2);
            node3 = new TreeNode(3);
            node2.left = node1;
            node2.right = node3;
            list.add(node2);

            node1 = new TreeNode(1);
            node2 = new TreeNode(2);
            node3 = new TreeNode(3);
            node2.left = node1;
            node2.right = null;
            node3.left = node2;
            node3.right = null;
            list.add(node3);

            node1 = new TreeNode(1);
            node2 = new TreeNode(2);
            node3 = new TreeNode(3);
            node1.left = null;
            node1.right = node2;
            node3.left = node1;
            node3.right = null;
            list.add(node3);

            return list;
        }

        List<TreeNode> generate = generate(1, n);
        return generate;
    }


    public List<TreeNode> generate( int leftIndex, int rightIndex) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        if (leftIndex > rightIndex) {
            res.add(null);
            return res;
        }
        for (int i = leftIndex; i <= rightIndex; i++) {
            List<TreeNode> leftTree = generate(leftIndex, i-1);
            List<TreeNode> rightTree = generate(i+1, rightIndex);
            for (TreeNode leftNode : leftTree) {
                for (TreeNode rightNode : rightTree) {
                    TreeNode node = new TreeNode(i);
                    node.right = rightNode;
                    node.left = leftNode;
                    res.add(node);
                }
            }
        }
        return res;
    }


}
