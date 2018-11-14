package com.lzx.java.algorithm.jzoffer;

/**
 * 数值的整数次方
 * @author liuzhixiong 
 * 2018年08月17日10:27:23
 */

public class Pro16 {
	public static void main(String[] args) throws Exception {
		double val = 2;
		System.out.println(new Pro16().power(val, -2));
	}
	
	public double power(double val, int exp) throws Exception{
		if(val == 0 && exp < 0){
			throw new Exception("0的负数次幂没有意义");
		}
		if(val == 0 && exp == 0){
			return 1.0;
		}
		double result = 0;
		if(exp < 0){
			result = 1/powWithExp(val, -exp);
		}else{
			result = powWithExp(val, exp);
		}
		return result;
	}
	
	public double powWithExp(double val, int exp){
		if(exp == 1){
			return val;
		}
		if(exp % 2 == 0){
			double temp = powWithExp(val, exp/2);
			return temp * temp;
		} else {
			double temp = powWithExp(val, exp/2);
			return temp * temp * val;
		}
	}
}
