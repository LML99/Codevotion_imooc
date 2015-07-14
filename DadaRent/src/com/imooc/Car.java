package com.imooc;

public abstract class Car {

	int    carId;
	String name;
	double fee;
	
	public Car(int carId, String name, double fee){
		this.carId     = carId;
		this.name      = name;
		this.fee       = fee;

	}
	
	public abstract void show();
	
}
