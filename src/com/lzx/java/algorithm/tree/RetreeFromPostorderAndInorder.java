package com.lzx.java.algorithm.tree;

import java.util.Arrays;
import java.util.LinkedList;

import com.lzx.java.node.TreeNode;

/**
 * 根据先序遍历和中序遍历重构二叉树
 * @author liuzhixiong
 * 2018年06月12日13:40:46
 */

public class RetreeFromPostorderAndInorder {
	
	public static void main(String[] args) throws Exception {
		int[] postSort = new int[] {7, 4, 2, 5, 8, 6, 3, 1};  
		int[] inSort = new int[] {4, 7, 2, 1, 5, 3, 8, 6};  
		TreeNode root= buildTree(postSort,inSort);
		
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode node = queue.pop();
			
			System.out.println(node.getVal());
			
			if(node.getLeft() != null){
				queue.add(node.getLeft());
			}
			
			if(node.getRight() != null){
				queue.add(node.getRight());
			}
		}
	}

	private static TreeNode buildTree(int[] postSort, int[] inSort) throws Exception {

		if(postSort == null || inSort == null){
			return null;
		}
		
		if(postSort.length != inSort.length){
			throw new Exception("不满足条件的非法输入！");  
		}
		
		TreeNode root = null;
		int len = postSort.length;
		for(int i=0; i<len; i++){
			if(inSort[i] == postSort[len-1]){
				root = new TreeNode(inSort[i]);
				root.setLeft(buildTree(Arrays.copyOfRange(postSort, 0, i), Arrays.copyOfRange(inSort, 0, i)));
				root.setRight(buildTree(Arrays.copyOfRange(postSort, i, len-1), Arrays.copyOfRange(inSort, i+1, len)));
			}
		}
		
		return root;
	}
	
	
}
