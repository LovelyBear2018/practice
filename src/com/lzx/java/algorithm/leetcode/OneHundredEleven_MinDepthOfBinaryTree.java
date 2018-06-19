package com.lzx.java.algorithm.leetcode;

import com.lzx.java.node.TreeNode;

/**
 * 二叉树最小深度
 * @author liuzhixiong
 * 2018年06月19日08:22:59
 */

public class OneHundredEleven_MinDepthOfBinaryTree {
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
		
		int max = minDepth(root);
		System.out.println("max=" + max);
		
	}
	
	public static int minDepth(TreeNode root) {
        if(root == null){
        	return 0;
        }
        
        int leftDepth = minDepth(root.getLeft());
        int rightDepth = minDepth(root.getRight());
        
        if(leftDepth == 0){
        	return rightDepth + 1;
        } else if(rightDepth == 0){
        	return leftDepth + 1;
        } else {
        	return Math.max(leftDepth, rightDepth) + 1;
        }
	}
}
