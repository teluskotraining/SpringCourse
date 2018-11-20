package com.telusko.AppleSpring;

// Beans

public class Car 
{
	private int cost;
	private Radio radio;
	
	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	public void setCost(int cost)
	{
		System.out.println("in set");
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void drive()
	{
		System.out.println("Vroommmm..." + cost);
		radio.play();
	}
}
