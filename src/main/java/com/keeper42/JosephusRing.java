package com.keeper42;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/2/27
 * @from 《Coding Interview Guide》 Page43
 * Solve the Josephus Ring Question by using link.
 */
public class JosephusRing {

    public class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public Node josephusRing1(int m, Node head) {
        if (m < 1 || head == null || head.next == head) {
            return head;
        }
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        int cnt = 0;
        while (head != last) {
            if (++cnt == m) {
                last.next = head.next;
                cnt = 0;
            } else {
                last = last.next;
            }
            head = last.next;
        }
        return head;
    }

    /**
     * calculate the last one who lives
     *
     * @param m
     * @param head
     * @return
     */
    public Node josephusRing2(int m, Node head) {
        if (m < 1 || head == null || head.next == head) {
            return head;
        }
        Node cur = head.next;
        int tmp = 1;
        while (cur != head) {
            tmp++;
            cur = cur.next;
        }
        tmp = getLive(tmp, m);
        while (--tmp != 0) {
            head = head.next;
        }
        head.next = head;
        return head;
    }

    private int getLive(int t, int m) {
        return (t == 1) ? 1 : (getLive(t - 1, m) + m - 1) % t + 1;
    }

}
