package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/19
 * @type leetcode 82
 */
public class _82 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-100);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        boolean flag = false;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
                flag = true;
            }
            if (flag) {
                pre.next = cur.next;
                flag = false;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

}
