package com.imooc;

public class Sedan extends Car {
	int passenger;
	
	public Sedan(int carId, String name, double fee, int passenger){
		super(carId, name, fee);
		this.passenger = passenger;
	}
	
	@Override
	public void show(){
		System.out.println(carId+".\t"+name+"\t"+fee+"/day\t"+passenger+" persons");
	}
}
