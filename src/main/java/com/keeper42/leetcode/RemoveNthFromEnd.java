package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/6
 * @type 19. 删除链表的倒数第 N 个结点
 */
public class RemoveNthFromEnd {

    int cnt = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        head.next = removeNthFromEnd(head.next, n);
        cnt++;
        if(n == cnt) {
            return head.next;
        }
        return head;
    }

}
