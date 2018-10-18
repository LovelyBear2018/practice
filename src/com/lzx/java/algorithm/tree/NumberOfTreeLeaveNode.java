package com.lzx.java.algorithm.tree;

import com.lzx.java.node.TreeNode;

import java.util.Stack;

/**
 * Created by liuzhixiong on 2018/10/18.
 */
public class NumberOfTreeLeaveNode {
    static int num = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(8);

        root.setLeft(node1);
        root.setRight(node2);

        node1.setLeft(node3);
        node1.setRight(node4);

        node2.setLeft(node5);
        node2.setRight(node6);

        node3.setLeft(node7);

        getNumberOfNodeRecur(root);
        System.out.println("节点个数:" + num);
    }

    private static void getNumberOfNodeRecur(TreeNode root){
        if(root != null){
            if(root.getLeft() == null && root.getRight() == null){
                num ++;
                return;
            }
            getNumberOfNodeRecur(root.getLeft());
            getNumberOfNodeRecur(root.getRight());
        }
    }

    private static void getNumberOfNodeNoRecur(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;

        while(!stack.isEmpty() || p != null){
            while(p != null){
                stack.push(p);
                p = p.getLeft();
            }

            if(!stack.isEmpty()){
                TreeNode pTemp = stack.pop();
                if(pTemp.getLeft() == null && pTemp.getRight() == null){
                    num ++;
                }
                p = pTemp.getRight();
            }
        }
    }
}
