package com.lzx.java.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.lzx.java.node.TreeNode;

/**
 * 非递归层次遍历二叉树
 * @author liuzhixiong
 * 2018年06月11日17:05:35
 */

public class LevelOrder_NonRecur {

	private static List<Integer> list = new ArrayList<Integer>();
	
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
		
		levelOrder(root);
		
		System.out.println(list.toString());
	}
	
	public static void levelOrder(TreeNode root){
		
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode node = queue.pop();
			list.add(node.getVal());
			if(node.getLeft() != null){
				queue.add(node.getLeft());
			}
			
			if(node.getRight() != null){
				queue.add(node.getRight());
			}
		}
	}
	
}
