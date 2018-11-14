package com.lzx.java.algorithm.jzoffer;

import java.util.Stack;

import com.lzx.java.algorithm.leetcode.ListNode;

/**
 * 从尾到头打印链表
 * 
 * @author liuzhixiong 2018年08月17日10:18:18
 */

public class Pro555 {

	public static void main(String args[]) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		printListReverseRecur(node1);
	}

	/*
	 * 栈实现
	 */
	public static void printListReverse(ListNode headNode) {
		Stack<ListNode> stack = new Stack<ListNode>();
		while (headNode != null) {
			stack.push(headNode);
			headNode = headNode.next;
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop().val);
		}
	}
	
	/*
	 * 递归实现
	 */
	public static void printListReverseRecur(ListNode headNode) {
		if(headNode.next != null){
			printListReverseRecur(headNode.next);
		}
		System.out.println(headNode.val);
	}

}
