package com.keeper42.leetcode;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/3
 * @type leetcode 2
 */
public class Sum {

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


    public int getSize(ListNode list) {
        int res = 0;
        while (list != null) {
            res += 1;
            list = list.next;
        }
        return res;
    }

    public ListNode addPosition(ListNode list) {
        ListNode pos = list;
        while (pos.val >= 10) {
            pos.val = pos.val - 10;
            if (pos.next != null) {
                pos.next.val += 1;
            } else {
                pos.next = new ListNode(1);
            }
            pos = pos.next;
        }
        return list;
    }

    public ListNode addValue(ListNode res, ListNode l1, ListNode l2) {
        ListNode index = res;
        while (l1 != null && l2 != null && index != null) {
            index.val = l1.val + l2.val;
            if (index.val >= 10) {
                index = addPosition(index);
            }
            l1 = l1.next;
            l2 = l2.next;
            index = index.next;
        }
        return res;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int size1 = getSize(l1);
        int size2 = getSize(l2);
        ListNode res = new ListNode();
        if (size1 >= size2) {
            res = l1;
            res = addValue(res, l1, l2);
        } else {
            res = l2;
            res = addValue(res, l1, l2);
        }
        return res;
    }

}
