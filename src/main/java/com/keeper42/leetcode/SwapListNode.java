package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/4
 */
public class SwapListNode {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode());
        head.next = new ListNode(2, new ListNode());
        head.next.next = new ListNode(3, new ListNode());
        head.next.next = new ListNode(4);
        ListNode tmp = head;
        if (tmp != null) {
            System.out.print(tmp.val);
            tmp = tmp.next;
        }
        System.out.println();
        ListNode newList = swapPairs(head);
        if (newList != null) {
            System.out.print(newList.val);
            newList = newList.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode travel = head;
        Integer size = 0;
        while (travel != null) {
            size++;
            travel = travel.next;
        }
        if (size == 1) {
            return head;
        }
        if (size == 2) {
            ListNode newHead = head.next;
            head.next = null;
            newHead.next = head;
            return newHead;
        }
        if (size > 2) {
            ListNode newHead = getNew(head, size);
            return newHead;
        }
        return head;
    }

    public static ListNode getNew(ListNode head, Integer size) {
        ListNode newHead = head.next;
        int cnt = 0;
        while (head != null && head.next != null) {
            cnt++;
            ListNode p0 = head.next;
            ListNode p1 = head.next.next;
            p0.next = head;
            if (p1 != null) {
                head.next = p1.next;
            } else {
                head.next = null;
            }
            if (size % 2 == 1 && size / 2 == cnt) {
                head.next = p1;
            }
            head = p1;
        }
        return newHead;
    }


}
