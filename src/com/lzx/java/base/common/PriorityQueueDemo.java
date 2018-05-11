package com.lzx.java.base.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/**
 * 优先队列Demo
 * @author liuzhixiong
 * 2017年10月25日16:00:15
 */

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		Random rand = new Random(47);
		for(int i=0; i<10; i++){
			priorityQueue.offer(rand.nextInt(i+10));
		}
		
		printQ(priorityQueue);
		
		List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23,25);
		priorityQueue = new PriorityQueue<Integer>(ints);
		printQ(priorityQueue);
		
		priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
		priorityQueue.addAll(ints);
		printQ(priorityQueue);
		
		
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
		printQ(stringPQ);
		
		stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		printQ(stringPQ);
	
		Set<Character> charSet = new HashSet<Character>();
		for(char c:fact.toCharArray()){
			charSet.add(c);
		}
		
		PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
		printQ(characterPQ);
	}
	
	@SuppressWarnings("rawtypes")
	private static void printQ(PriorityQueue priorityQueue){
		for(Object i:priorityQueue){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
