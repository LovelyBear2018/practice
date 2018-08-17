package com.lzx.java.algorithm.jzoffer;

/**
 * 替换空格
 * @author liuzhixiong 
 * 2018年08月17日10:18:18
 */

public class Pro4 {

	public static void main(String args[]) {
		String s = "We are happy.";
		System.out.println(replaceBlank(s));
	}

	public static String replaceBlank(String input) {
		if (input == null)
			return null;
		StringBuffer outputBuffer = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				outputBuffer.append("%");
				outputBuffer.append("2");
				outputBuffer.append("0");
			} else {
				outputBuffer.append(String.valueOf(input.charAt(i)));
			}
		}
		return new String(outputBuffer);
	}

}
