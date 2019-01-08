package com.lzx.java.algorithm.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by liuzhixiong on 2018/12/16.
 */
public class LeetCode950_RevealCardsIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        LinkedList<Integer> queue = new LinkedList<Integer>();

        for(int i=deck.length-1; i>=0; i--){
            int current = deck[i];
            if(!queue.isEmpty()){
                int first = queue.pollFirst();
                queue.add(first);
                queue.add(current);
            } else {
                queue.add(current);
            }
        }

        int[] res = new int[deck.length];
        int idx = res.length-1;
        while(!queue.isEmpty()){
            res[idx --] = queue.pollFirst();
        }
        return res;
    }
}
