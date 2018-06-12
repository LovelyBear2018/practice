package com.lzx.java.node;

/**
 * 树叶子节点
 * @author liuzhixiong
 * 2018年06月11日17:06:48
 */

public class TreeNode {
	
	TreeNode left;
	TreeNode right;
	int val;
	
	public TreeNode(int val){
		this.val = val;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	
}
