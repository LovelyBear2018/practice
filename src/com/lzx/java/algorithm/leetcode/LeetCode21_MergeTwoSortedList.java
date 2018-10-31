package com.lzx.java.algorithm.leetcode;

/**
 * 合并两个有序列表
 * @author liuzhixiong
 * 2018年06月15日15:39:56
 */

public class LeetCode21_MergeTwoSortedList {
	public static void main(String[] args) {
		ListNode head0 = new ListNode(0);
		ListNode head2 = new ListNode(2);
		ListNode head4 = new ListNode(4);
		ListNode head6 = new ListNode(6);
		
		head0.next = head2;
		head2.next = head4;
		head4.next = head6;
		
		ListNode head1 = new ListNode(1);
		ListNode head3 = new ListNode(3);
		ListNode head5 = new ListNode(5);
		ListNode head7 = new ListNode(7);
		
		head1.next = head3;
		head3.next = head5;
		head5.next = head7;
		
		ListNode res = mergeTwoSortedList(head0, head1);
		while(res != null){
			System.out.print(res.val + " ");
			res = res.next;
		}
	}
	
	public static ListNode mergeTwoSortedList(ListNode head1, ListNode head2){
		if(head1 == null) return head2;
		if(head2 == null) return head1;
		
		ListNode tempHead = new ListNode(-1);
		ListNode tail = tempHead;
		
		while(head1 != null && head2 != null){
			if(head1.val > head2.val){
				tail.next = head2;
				head2 = head2.next;
				tail = tail.next;
			} else {
				tail.next = head1;
				head1 = head1.next;
				tail = tail.next;
			}
		}
		
		while(head1 != null){
			tail.next = head1;
			head1 = head1.next;
			tail = tail.next;
		}
		
		while(head2 != null){
			tail.next = head1;
			head2 = head2.next;
			tail = tail.next;
		}
		
		return tempHead.next;
	}
}
