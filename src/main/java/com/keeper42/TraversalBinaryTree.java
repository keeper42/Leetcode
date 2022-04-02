package com.keeper42;

import java.util.Stack;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/3
 * @from 《Coding Interview Guide》 Page90
 * Traversal binary tree by using stack.
 */
public class TraversalBinaryTree {

    public class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public void preOrder(Node head) {
        if (head != null) {
            Stack<Node> stack = new Stack<>();
            stack.add(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                System.out.println(head.value + " ");
                if (head.right != null) {
                    stack.push(head.right);
                }
                if (head.left != null) {
                    stack.push(head.left);
                }
            }
        }
    }

}
