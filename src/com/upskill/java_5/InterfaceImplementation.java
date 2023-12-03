package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		System.out.println("My Car has 4 door");
	}

	@Override
	public void iWheel() {
		System.out.println("My Car has 4 Wheel");		
	}

	@Override
	public void iEngine() {
		System.out.println("My Car has 2 engine");
	}

	@Override
	public int iSail() {
		System.out.println("My boat has 1 sail");
		return 1;
	}

	@Override
	public String iCabin() {
		System.out.println("My boat has AC cabin");
		return "AC";
	}

}
