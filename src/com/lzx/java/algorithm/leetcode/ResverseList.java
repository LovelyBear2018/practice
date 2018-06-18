package com.lzx.java.algorithm.leetcode;

/**
 * 链表反转
 * @author liuzhixiong
 * 2018年06月15日15:12:43
 */

public class ResverseList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ListNode res = reverseList(head);
		
		while(res != null){
			System.out.print(res.val + " ");
			res = res.next;
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
