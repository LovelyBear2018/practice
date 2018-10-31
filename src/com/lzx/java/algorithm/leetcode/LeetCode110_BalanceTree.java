package com.lzx.java.algorithm.leetcode;

import com.lzx.java.node.TreeNode;

/**
 * 判断一棵树是否是平衡二叉树
 * @author liuzhixiong
 * 2018年06月19日08:22:59
 */

public class LeetCode110_BalanceTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(7);
		
		root.setLeft(node1);
		root.setRight(node2);
		node2.setLeft(node3);
		node2.setRight(node4);
		
		boolean b = isBalanced(root);
		System.out.println("b=" + b);
		
	}
	
	public static boolean isBalanced(TreeNode root) {
        return isBal(root, 0) != -1;
    }

	private static int isBal(TreeNode root, int h) {
		if(root == null){
			return 0;
		}
		
		int l = isBal(root.getLeft(), h + 1);
		if(l == -1){
			return -1;
		}
		
		int r = isBal(root.getRight(), h + 1);
		if(r == -1){
			return -1;
		}
		
		if(Math.abs(r-l) > 1){
			return -1;
		} else {
			return Math.max(l, r);
		}
	}
	
	
}
