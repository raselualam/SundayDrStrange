package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;
		int[] ageDrStrange = new int[]{25, 21, 30, 35, 28};
		
		//Array index				   [0] [1] [2] [3] [4]
		
		System.out.println(age);
		System.out.println(ageDrStrange[4]);
		System.out.println(ageDrStrange.length);
		
		String[] nameDrStrange = new String[]{"Jisan", "Adnan", "Vlad", "Tarek", "Mahdi", "Ishaq"};
		System.out.println(nameDrStrange[3]);
		System.out.println(nameDrStrange.length);
		
		//Multi-Dimentional Array
		int[][] ageDrStrange2D = {{25, 21, 30, 35, 28},	 //[0][0] [0][1] [0][2] [0][3] [0][4]
								  {31, 32, 25}};		 //[1][0] [1][1] [1][2] 
		
		System.out.println(ageDrStrange2D[1][2]);
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap <String, Integer>();
		
		Student.put("Jisan", 25);
		Student.put("Adnan", 26);
		Student.put("Vlad", 28);
		Student.put("Tarek", 23);
		Student.put("Mahdi", 21);
		Student.put("Ishaq", 21);
		
		System.out.println(Student.get("Adnan"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City : " + Capital.get("BD"));	
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Tesla");
		
		System.out.println(car);
		
		//HashTable store multiple data using key-value pair, No duplicate, 
		//also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Region : " + Region.get("BD"));
	}
}