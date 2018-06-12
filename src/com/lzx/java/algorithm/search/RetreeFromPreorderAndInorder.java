package com.lzx.java.algorithm.search;

import java.util.Arrays;
import java.util.LinkedList;

import com.lzx.java.node.TreeNode;

/**
 * 根据先序遍历和中序遍历重构二叉树
 * @author liuzhixiong
 * 2018年06月12日13:40:46
 */

public class RetreeFromPreorderAndInorder {
	
	public static void main(String[] args) throws Exception {
		int[] preSort = {1, 2, 4, 7, 3, 5, 6, 8};  
		int[] inSort = new int[]{4, 7, 2, 1, 5, 3, 8, 6};  
		TreeNode root= buildTree(preSort,inSort);
		
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

	private static TreeNode buildTree(int[] preSort, int[] inSort) throws Exception {

		if(preSort == null || inSort == null){
			return null;
		}
		
		if(preSort.length != inSort.length){
			throw new Exception("不满足条件的非法输入！");  
		}
		
		TreeNode root = null;
		
		for(int i=0; i<inSort.length; i++){  
			if(inSort[i] == preSort[0]){  
				root = new TreeNode(preSort[0]);  
				root.setLeft(buildTree(Arrays.copyOfRange(preSort, 1, i+1), Arrays.copyOfRange(inSort, 0, i)));  
				root.setRight(buildTree(Arrays.copyOfRange(preSort, i+1, preSort.length), Arrays.copyOfRange(inSort, i+1, inSort.length)));  
			}
		}
		
		return root;
	}
	
	
}
