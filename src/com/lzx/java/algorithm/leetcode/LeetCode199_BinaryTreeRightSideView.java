package com.lzx.java.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.lzx.java.node.TreeNode;

/**
 * 输出二叉树层次
 * @author liuzhixiong
 * 2018年06月19日08:22:59
 */

public class LeetCode199_BinaryTreeRightSideView {
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
		
		List<Integer> list = rightSideView(root);
		System.out.println("list=" + list);
		
	}
	
	public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(root);
        queue.add(null);
        
        while(!queue.isEmpty()){
            TreeNode node = queue.pollFirst();
            
            if(node == null){
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
            }else{
                if(queue.peek() == null) list.add(node.getVal());
                if(node.getLeft() != null) queue.add(node.getLeft());
                if(node.getRight() != null) queue.add(node.getRight());
            }
        }
        
        return list;
        
    }
}
