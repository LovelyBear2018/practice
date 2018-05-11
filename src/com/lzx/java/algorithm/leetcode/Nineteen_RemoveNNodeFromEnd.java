package com.lzx.java.algorithm.leetcode;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
示例：
给定一个链表: 1->2->3->4->5, 和 n = 2.
当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * @author liuzhixiong
 * 2018年04月28日13:34:46
 */

public class Nineteen_RemoveNNodeFromEnd {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		
		head.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		
		ListNode resHead = new Nineteen_RemoveNNodeFromEnd().removeNthFromEnd(head, 1);
		while(resHead != null){
			System.out.println(resHead.val);
			resHead = resHead.next;
		}
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        
		if(head == null){
            return null;
        }
        
        ListNode temphead = new ListNode(0);
        temphead.next = head;
        
        int index = 0;
        ListNode node1 = head;
        while(index != n && node1 != null){
            index ++;
            node1 = node1.next;
        }
        
        ListNode node2 = temphead;
        
        while(node1 != null){
            node1 = node1.next;
            node2 = node2.next;
        }
        
        if(node2.next != null){
            node2.next = node2.next.next;
        }
        
        return temphead.next;
    }
}
