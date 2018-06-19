package com.lzx.java.algorithm.leetcode;

import com.lzx.java.node.TreeNode;

/**
 * 二叉树最大深度
 * @author liuzhixiong
 * 2018年06月19日08:22:59
 */

public class OneHundredFour_MaxDepthOfBinaryTree {
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
		
		int max = maxDepth(root);
		System.out.println("max=" + max);
		
	}
	
	public static int maxDepth(TreeNode root) {
        if(root == null){
        	return 0;
        }
        
        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());
        
        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
}
