package com.ustglobal.objectclass;

public class Car {
	int cost;
	String brand;
	String colour;
	public Car(int cost, String brand, String colour) {
		super();
		this.cost = cost;
		this.brand = brand;
		this.colour = colour;
	}
	@Override
	public int hashCode() {
		return cost;
	}
	@Override
	public String toString() {
		return "Car [cost=" + cost + ", brand=" + brand + ", colour=" + colour + "]";
	}
	

}
