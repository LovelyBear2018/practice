package com.lzx.java.algorithm.jzoffer;

import com.lzx.java.algorithm.leetcode.ListNode;

/**
 * 给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间删除该节点。
 * Created by liuzhixiong on 2018/11/7.
 */
public class Pro18 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode res = new Pro18().deleteNode(l1, l3);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private ListNode deleteNode(ListNode head, ListNode node){
        if(node == head){
            head = head.next;
            return head;
        }
        if(node.next == null){
            ListNode tempHead = head;
            while(tempHead.next != node){
                tempHead = tempHead.next;
            }
            tempHead.next = null;
            return head;
        }
        node.val = node.next.val;
        node.next = node.next.next;
        return head;
    }
}
