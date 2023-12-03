package com.upskill.java_1;

public class Variables {
	
	//Variables in Java

	public static void main(String[] args) {
		
		Variables obj = new Variables();
		obj.newyork();
		obj.texas("Steak");
		System.out.println(obj.country);
		System.out.println(president);
	}
	
	String country = "USA";				//Instance OR global variable - Variables declared in Class level, outside method
	static String president = "Biden";	//Static variable - variables belong to class and don't required creating object
	
	
	public static void newyork(){
		String city = "Queens";			//Local variable - variables declared in methods
		String police = "NYPD";
		System.out.println(police);
	}
	
	public static void texas(String food){	//Method parameter - passing data from outside to inside of method
		String city = "Austin";
		String police = "APD";
		System.out.println(police);
		System.out.println(food);
	}
}