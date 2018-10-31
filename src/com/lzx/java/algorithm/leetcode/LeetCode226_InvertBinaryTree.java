package com.lzx.java.algorithm.leetcode;

import com.lzx.java.node.TreeNode;

/**
 * 翻转二叉树
 * Created by liuzhixiong on 2018/10/30.
 */
public class LeetCode226_InvertBinaryTree {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);

        return root;
    }
}
