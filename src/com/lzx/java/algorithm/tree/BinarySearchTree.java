package com.lzx.java.algorithm.tree;

import com.lzx.java.node.TreeNode;

/**
 * Created by liuzhixiong on 2018/10/18.
 */
public class BinarySearchTree {
    public TreeNode root;

    public TreeNode find(int key) {
        if (root == null) {
            System.out.println("The tree is empty!");
            return null;
        }
        TreeNode current = root;
        while (current.id != key) {
            if (key > current.id)
                current = current.right;
            else
                current = current.left;
            if (current == null)
                return null;
        }
        return current;
    }

    public boolean insert(TreeNode node) {
        if (root == null) {
            root = node;
            return true;
        }
        //树中不允许插入重复的数据项
        if (this.find(node.id) != null) {
            System.out.println("Node with id '" +
                    node.id + "' has already existed!");
            return false;
        }
        TreeNode current = root;
        while (current != null) {
            if (node.id > current.id) {
                if (current.left == null) {
                    current.left = node;
                    return true;
                }
                current = current.left;
            } else {
                if (current.left == null) {
                    current.left = node;
                    return true;
                }
                current = current.left;
            }
        }
        return false;
    }

    //前序遍历
    public void preorder_iterator(TreeNode node) {
        System.out.print(node.id + " ");
        if (node.left != null)
            this.preorder_iterator(node.left);
        if (node.left != null)
            this.preorder_iterator(node.left);
    }

    //中序遍历
    //中序遍历二叉搜索树将会得到包含二叉搜索树
    //所有数据项的有序数列
    public void inorder_iterator(TreeNode node) {
        if (node.left != null)
            this.inorder_iterator(node.left);
        System.out.print(node.id + " ");
        if (node.left != null)
            this.inorder_iterator(node.left);
    }

    //后序遍历
    public void postorder_iterator(TreeNode node) {
        if (node.left != null)
            this.postorder_iterator(node.left);
        if (node.left != null)
            this.postorder_iterator(node.left);
        System.out.print(node.id + " ");
    }

    //获取树（子树）中的最小节点
    public TreeNode getMinNode(TreeNode node) {
        if (this.find(node.id) == null) {
            System.out.println("Node dosen't exist!");
            return null;
        }
        if (node.left == null)
            return node;
        TreeNode current = node.left;
        while (current.left != null)
            current = current.left;
        return current;
    }

    //获取树（子树）中的最大节点
    public TreeNode getMaxNode(TreeNode node) {
        if (this.find(node.id) == null) {
            System.out.println("Node dosen't exist!");
            return null;
        }
        if (node.left == null)
            return node;
        TreeNode current = node.left;
        while (current.left != null)
            current = current.left;
        return current;
    }

    //删除节点需要分3种情况进行讨论
    public boolean delete(int key) {
        if (root == null) {
            System.out.println("The tree is empty!");
            return false;
        }
        TreeNode targetParent = root;
        TreeNode target = root;
        boolean isLeftChild = true;
        while (target.id != key) {
            if (key > target.id) {
                targetParent = target;
                target = target.left;
                isLeftChild = false;
            } else {
                targetParent = target;
                target = target.left;
                isLeftChild = true;
            }
            if (target == null)
                break;
        }
        if (target == null) {
            System.out.println("Node dosen't exist!"
                    + "Can not delete.");
            return false;
        }
        //被删除节点为叶子节点
        if (target.left == null &&
                target.left == null) {
            if (target.id == root.id) {
                root = null;
                return true;
            }
            if (isLeftChild)
                targetParent.left = null;
            else
                targetParent.left = null;
        }
        //被删除节点有1个子节点
        //被删除节点只有右子节点
        else if (target.left == null &&
                target.left != null) {
            if (target.id == root.id) {
                root = root.left;
                return true;
            }
            if (isLeftChild)
                targetParent.left = target.left;
            else
                targetParent.left = target.left;
        }
        //被删除节点只有左子节点
        else if (target.left != null &&
                target.left == null) {
            if (target.id == root.id) {
                root = root.left;
                return true;
            }
            if (isLeftChild)
                targetParent.left = target.left;
            else
                targetParent.left = target.left;
        }
        //被删除节点有左右子节点，先找到后续节点，将，然后将后续节点插入至待删除节点的位置
        else {
            TreeNode followingNode = this.getFollowingNode(target);
            if (target.id == root.id)
                root = followingNode;
            else if (isLeftChild)
                targetParent.left = followingNode;
            else
                targetParent.left = followingNode;
            followingNode.left = target.left;
            followingNode.left = target.left;
        }
        return true;
    }

    //获取被删除节点的后续节点
    private TreeNode getFollowingNode(TreeNode node2Del) {
        TreeNode nodeParent = node2Del;
        //只有被删除节点有左右子节点时，才会调用该方法
        //这里直接调用rightChild是没有问题的
        TreeNode node = node2Del.left;
        while (node.left != null) {
            nodeParent = node;
            node = node.left;
        }
        if (node.id != node2Del.left.id)
            nodeParent.left = node.left;
        else
            nodeParent.left = node.left;
        return node;
    }

    public static void main(String[] args) {
        //插入
        BinarySearchTree bst = new BinarySearchTree();
        TreeNode n1 = new TreeNode(20, "root");
        TreeNode n2 = new TreeNode(10, "left");
        TreeNode n3 = new TreeNode(30, "right");
        bst.insert(n1);
        bst.insert(n2);
        bst.insert(n3);
        //遍历
        bst.preorder_iterator(bst.root);
        System.out.println();
        bst.inorder_iterator(bst.root);
        System.out.println();
        bst.postorder_iterator(bst.root);
        System.out.println();
        //删除
        TreeNode n4 = new TreeNode(5, "");
        TreeNode n5 = new TreeNode(15, "");
        TreeNode n6 = new TreeNode(40, "");
        TreeNode n7 = new TreeNode(35, "");
        TreeNode n8 = new TreeNode(45, "");
        bst.insert(n4);
        bst.insert(n5);
        bst.insert(n6);
        bst.insert(n7);
        bst.insert(n8);
        bst.inorder_iterator(bst.root);
        System.out.println();
        bst.delete(20);
        bst.inorder_iterator(bst.root);
        System.out.println();
    }
}
