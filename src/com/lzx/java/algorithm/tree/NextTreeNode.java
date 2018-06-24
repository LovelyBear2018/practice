package com.lzx.java.algorithm.tree;

import java.util.Stack;

import com.lzx.java.node.TreeNode;

/**
 * 二叉树某节点的下一个节点
 * @author liuzhixiong
 * 2018年06月23日23:22:36
 */

public class NextTreeNode {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		
		root.setLeft(node1);
		root.setRight(node2);
		
		node1.setLeft(node3);
		node1.setRight(node4);
		
		node2.setLeft(node5);
		node2.setRight(node6);
		
		int res = preOrder(root, 6);
		
		System.out.println("res = " + res);
	}
	
	public static int preOrder(TreeNode root, int ele){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		boolean b = false;
		int res = -1;
		while(!stack.isEmpty() || root != null){
			while(root != null){
				stack.push(root);
				root = root.getLeft();
			}
			
			if(!stack.isEmpty()){
				root = stack.pop();
				if(b){
					res = root.getVal();
					break;
				}
				if(root.getVal() == ele){
					b = true;
				}
				root = root.getRight();
			}
		}
		
		return res;
	}
	
}
