package com.lzx.java.algorithm.tree;

import com.lzx.java.node.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by liuzhixiong on 2019/1/3.
 */
public class PrintTreeLeftSet {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.left = t6;

        printLeft(t1);
    }

    public static void printLeft(TreeNode root) {
        List<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(new TreeNode(-1));
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode p = queue.remove(0);
            if (p.getVal() == -1) {
                queue.add(new TreeNode(-1));
                p = queue.remove(0);
                if (queue.size() != 0) {
                    System.out.println(p.getVal());
                }
            }
            if (p.getLeft() != null) {
                queue.add(p.getLeft());
            }
            if (p.getRight() != null) {
                queue.add(p.getRight());
            }
        }
    }
}
