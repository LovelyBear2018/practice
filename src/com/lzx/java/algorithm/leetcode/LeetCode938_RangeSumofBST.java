package com.lzx.java.algorithm.leetcode;

import com.lzx.java.node.TreeNode;

/**
 * Created by liuzhixiong on 2018/12/15.
 */
public class LeetCode938_RangeSumofBST {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root != null){
            int val = root.getVal() ;
            if(val < L){
                rangeSumBST(root.right, L, R);
            } else if(val == L){
                sum += L;
                rangeSumBST(root.right, L+1, R);
            } else if(L < val && val < R){
                sum += val;
                rangeSumBST(root.left, L, val-1);
                rangeSumBST(root.right, val+1, R);
            } else if(val == R){
                sum += R;
                rangeSumBST(root.left, L, R-1);
            } else if(val > R){
                rangeSumBST(root.left, L, R);
            }
        }
        return sum;
    }
}
