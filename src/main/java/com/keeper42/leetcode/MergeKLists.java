package com.keeper42.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/12
 * @type leetcode 23
 */
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode curr = head;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));

        for (ListNode list : lists) {
            if (list == null) {
                continue;
            }
            pq.add(list);
        }

        while (!pq.isEmpty()) {
            ListNode nextNode = pq.poll();
            curr.next = nextNode;
            curr = curr.next;
            if (nextNode.next != null) {
                pq.add(nextNode.next);
            }
        }
        return head.next;
    }

}
