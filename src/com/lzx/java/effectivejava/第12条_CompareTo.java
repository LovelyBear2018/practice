package com.lzx.java.effectivejava;

public class 第12条_CompareTo implements Comparable<第12条_CompareTo>{

	private String name = "";
	
	public 第12条_CompareTo(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(第12条_CompareTo o) {
		if(this.name.length() < o.name.length()){
			return -1;
		} else if(this.name.length() > o.name.length()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		第12条_CompareTo ct1 = new 第12条_CompareTo("abc");
		第12条_CompareTo ct2 = new 第12条_CompareTo("abcd");
		System.out.println(ct1.compareTo(ct2));
	}
	
}
