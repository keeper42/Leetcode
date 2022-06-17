package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/6/17
 */
public class LinkHasCycle {

    // fast and slow point
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

}
