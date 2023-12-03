package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "UpSkill";			//write & read
	private int ssn = 123456;					//write only
	private String username = "raselalam";		//read only
	
	
	//Setter Method - ssn						//set the data, Write
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method - username					//get the data, Read
	public String getUserName(){
		return username;
	}
	
	//Setter Method - name						 //set the data, Write
	public void setName(String value){			
		name = value;
	}
	
	//Getter Method - name		 				//get the data, Read
	public String getName(){
		return name;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		System.out.println(obj.getUserName());
		
		obj.setName("Zisan");
		obj.setSSN(546875);
	}
}
