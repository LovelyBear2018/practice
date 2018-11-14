package com.lzx.java.algorithm.jzoffer;

import com.lzx.java.algorithm.leetcode.ListNode;

/**
 * 反转单链表
 * Created by liuzhixiong on 2018/11/7.
 */
public class Pro24 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode res = new Pro24().reverseList(l1);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode currentHead = null;
        ListNode currentNode = head;
        ListNode nextNode = head.next;
        while(currentNode != null){
            currentNode.next = currentHead;
            currentHead = currentNode;
            currentNode = nextNode;
            if(currentNode != null){
                nextNode = currentNode.next;
            }
        }
        return currentHead;
    }
}
