package com.upskill.java_5;

public abstract class AbstractClass {

	//Abstract class has both abstract method and regular method
	
	public void car(){
		System.out.println("My car is Tesla");
	}
	
	public abstract void iDoor();
	
	public abstract void iWheel();
	
	public abstract void iEngine();
	
	public int Boat(){
		return 5;
	}
	
	public String Color(){
		return "Red";
	}
	
	public abstract int iSail();
	
	public abstract String iCabin();
	
}