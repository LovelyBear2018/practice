package com.lzx.java.algorithm.jzoffer;

import com.lzx.java.node.TreeNode;

/**
 * 对称二叉树
 * Created by liuzhixiong on 2018/11/7.
 */
public class Pro28 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(3);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        boolean res = new Pro28().isSimmeTree(t1);
        System.out.println(res);
    }

    private boolean isSimmeTree(TreeNode root) {
        if(root == null) {
            return true;
        }

        return isSim(root.left, root.right);
    }

    private boolean isSim(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null && t2 != null || t1 != null && t2 == null){
            return false;
        }

        if(t1.getVal() != t2.getVal()){
            return false;
        }

        return isSim(t1.getLeft(), t2.getRight()) && isSim(t1.getRight(), t2.getLeft());
    }
}
