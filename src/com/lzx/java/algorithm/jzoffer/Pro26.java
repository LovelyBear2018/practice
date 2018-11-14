package com.lzx.java.algorithm.jzoffer;

import com.lzx.java.node.TreeNode;

/**
 * 树的子结构
 * Created by liuzhixiong on 2018/11/7.
 */
public class Pro26 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(8);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(9);
        TreeNode t5 = new TreeNode(8);
        TreeNode t6 = new TreeNode(9);
        TreeNode t7 = new TreeNode(2);

        TreeNode t8 = new TreeNode(8);
        TreeNode t9 = new TreeNode(9);
        TreeNode t10 = new TreeNode(2);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.left = t6;
        t5.right = t7;

        t8.left = t9;
        t8.right = t10;

        boolean res = new Pro26().hasSubTree(t1, t8);
        System.out.println(res);
    }

    private boolean hasSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        boolean res = false;
        if (root1 != null && root2 != null) {
            if (root1.getVal() == root2.getVal())
                res = doesTree1HaveTree2(root1, root2);
            if (!res)
                res = hasSubTree(root1.left, root2);
            if (!res)
                res = hasSubTree(root1.right, root2);
        }
        return res;
    }

    public boolean doesTree1HaveTree2(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.getVal() != root2.getVal())
            return false;
        return doesTree1HaveTree2(root1.left, root2.left) && doesTree1HaveTree2(root1.right, root2.right);
    }
}
