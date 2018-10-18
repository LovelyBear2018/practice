package com.lzx.java.algorithm.leetcode;

/**
 * 两个链表相加
 * 1->2->5 + 8->8->6 = 2->5->1
 * Created by liuzhixiong on 2018/10/18.
 */
public class AddTwoLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(8);
        ListNode node5 = new ListNode(6);

        head.next = node1;
        node1.next = node2;
        node3.next = node4;
        node4.next = node5;

        ListNode res = add(head, node3);

        while(res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }

    private static ListNode add(ListNode l1, ListNode l2){
        ListNode l1Reverse = reverseList(l1);
        ListNode l2Reverse = reverseList(l2);

        boolean add = false;
        ListNode head1 = l1Reverse;
        ListNode head2 = l2Reverse;
        while(head1 != null && head2 != null){
            int sum = head1.val + head2.val;
            if(add){
                sum += 1;
            }
            if(sum > 9){
                head1.val = sum - 10;
                add = true;
            } else {
                head1.val = sum;
                add = false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if(add){
            ListNode head = new ListNode(1);
            head.next = reverseList(l1Reverse);
            return head;
        } else {
            return reverseList(l1Reverse);
        }
    }

    private static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode now = head;

        while(now != null){
            ListNode next = now.next;
            now.next = prev;
            prev = now;
            now = next;
        }
        return prev;
    }

}
