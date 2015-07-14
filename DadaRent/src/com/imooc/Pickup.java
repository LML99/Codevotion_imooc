package com.imooc;

public class Pickup extends Car {
	int passenger;
	int good;
	
	public Pickup(int carId, String name, double fee, int passenger, int good){
		super(carId, name, fee);
		this.passenger = passenger;
		this.good      = good;
	}
	
	@Override
	public void show(){
		System.out.println(carId+".\t"+name+"\t"+fee+"/day\t"+passenger+" persons,\t"+good+" good");
	}

}
