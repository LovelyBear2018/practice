package com.lzx.java.algorithm.leetcode;

import com.lzx.java.node.TreeNode;

/**
 * 二叉树根节点到叶子节点路径求总和
 * @author liuzhixiong
 * 2018年06月19日08:22:59
 */

public class OneHundredTwentyNinth_SumRootToLeave {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(5);
		TreeNode node4 = new TreeNode(7);
		
		root.setLeft(node1);
		root.setRight(node2);
		node2.setLeft(node3);
		node2.setRight(node4);
		
		int sum = sumNumbers(root);
		System.out.println("sum=" + sum);
		
	}
	
	private static int sum = 0;
	
	public static int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }        
        
        getRes(root, 0);
        return sum;
    }
    
    public static void  getRes(TreeNode root, int num){
        num = num * 10 + root.getVal();
        if(root.getLeft() == null && root.getRight() == null){
            sum += num;
        }else{
            if(root.getLeft() != null){
                getRes(root.getLeft(), num);
            }
            
            if(root.getRight() != null){
                getRes(root.getRight(), num);
            }
        }
    }
}
