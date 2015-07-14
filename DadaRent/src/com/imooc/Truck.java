package com.imooc;

public class Truck extends Car {
	
	int good;
	
	public Truck(int carId, String name, double fee, int good){
		super(carId, name, fee);
		this.good = good;
	}
	
	@Override
	public void show(){
		System.out.println(carId+".\t"+name+"\t"+fee+"/day\t"+good+" good");
	}

}
