package com.upskill.java_1;

public class MethodType extends Variables {
	
	/* 	Types of Methods
	 
	1.Void Method
	2.Static Method
	3.Return Type Method  
 */

	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		weeklyIncomeStatic();
		
		System.out.println("My Monthly Income = " + monthlyIncomeReturn());
		System.out.println(name());
	}
	
	static int hourlyIncome = 65;
	
	//void method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);	
	}
	
	//static method 
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);	
	}
	
	//return type method
	public static int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	public static String name(){
		return "Rasel";
	}
}