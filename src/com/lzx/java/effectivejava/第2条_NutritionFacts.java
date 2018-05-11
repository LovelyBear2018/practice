package com.lzx.java.effectivejava;

/**
 * builder模式
 * @author liuzhixiong
 * 2018年05月10日13:53:28
 */

public class 第2条_NutritionFacts {

	private int servingSize;
	private int servings;
	private int calories;
	private int fat;
	private int sodium;
	private int carbohydrate;
	
	public static class Builder{
		//必须的参数
		private int servingSize;
		private int servings;
		
		//可选参数
		private int calories;
		private int fat;
		private int sodium;
		private int carbohydrate;
		
		public Builder(int servingSize, int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val){
			calories = val;
			return this;
		}
		
		public Builder fat(int val){
			fat = val;
			return this;
		}
		
		public Builder carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		
		public Builder sodium(int val){
			sodium = val;
			return this;
		}
		
		public 第2条_NutritionFacts build(){
			return new 第2条_NutritionFacts(this);
		}
		
	}
	
	public 第2条_NutritionFacts(Builder builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	@Override
	public String toString() {
		return "第2条_NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}



	public static void main(String[] args) {
		第2条_NutritionFacts facts = new 第2条_NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
		System.out.println(facts.toString());
	}

}
