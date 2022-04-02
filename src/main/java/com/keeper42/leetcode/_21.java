package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/17
 */
public class _21 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode newListNode = new ListNode();
            ListNode current = newListNode;  // 用于移动指针，便于连接后继结点
            while (null != l1 && null != l2) {
                if (l1.val < l2.val) {
                    current.next = l1;
                    current = current.next;
                    l1 = l1.next;
                }
//                if (l2.val < l1.val) {
//                    current.next = l2;
//                    current = current.next;
//                    l2 = l2.next;
//                }
                else {
                    current.next = l2;
                    current = current.next;
                    l2 = l2.next;
                }
            }
            if (null == l1) {
                current.next = l2;
            }
//            if (null == l2) {
//                current.next = l1;
//            }
            else {
                current.next = l1;
            }
            return newListNode.next;
        }
    }

}
