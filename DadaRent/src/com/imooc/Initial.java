package com.imooc;
import java.util.Scanner;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner(System.in);
	System.out.println("Will you rent cars?");
	System.out.println("0-No    1-Yes");
	
	int rent = input.nextInt();
	
	switch (rent){
	case 1:
		
		Car aodi         = new Sedan (1,"AodiA4",      500,  4);
		Car mazida       = new Sedan (2,"Mazida6",     400,  4);
		Car pikaxue      = new Pickup(3,"Pikaxue6",    450,4,2);
		Car jinlong      = new Sedan (4,"jinlong",     800, 20);
		Car songhuajiang = new Truck (5,"songhuajiang",400,  4);
		Car yiweike      = new Truck (6,"yiweike",     1000,20);
		
		Car cars[] = {aodi, mazida, pikaxue, jinlong, songhuajiang, yiweike};
		
		System.out.println("The candidate cars are shown below:");
		System.out.println("Index \t Name \t Fee \t Capacity");
		for(int i=0; i<cars.length; i++){
			cars[i].show();
		}
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter the number of cars you want:");
		int number = input2.nextInt();
		
		int[] indexList = new int[number];
		
		for(int i=0; i<indexList.length; i++){
			Scanner input3 = new Scanner(System.in);
			System.out.println("Please enter the index of "+(i+1)+"th car:");
			indexList[i] = input3.nextInt();
		}
		
		
		Scanner input4 = new Scanner(System.in);
		System.out.println("Please enter the total days you want to rent:");
		int day = input4.nextInt();
		
		// Compute the final summary
		int    sumPassenger = 0;
		int    sumGood      = 0;
		double sumFee       = 0;
		
		for(int i=0; i<indexList.length; i++){
			for(int j=0; j<cars.length; j++){
				if(cars[j].carId == indexList[i]){
					sumFee = sumFee + day * cars[j].fee;
					
					if(cars[j] instanceof Sedan){
						sumPassenger = sumPassenger + ((Sedan)cars[j]).passenger;
					}else if(cars[j] instanceof Pickup){
						sumPassenger = sumPassenger + ((Pickup)cars[j]).passenger;
						sumGood      = sumGood      + ((Pickup)cars[j]).good;
					}else if(cars[j] instanceof Truck){
						sumGood      = sumGood      + ((Truck)cars[j]).good;
					}
				}
			}
		}
		
		int numCarPassenger = 0;
		int numCarGood      = 0;
		
		
		for(int i=0; i<indexList.length; i++){
			for(int j=0; j<cars.length; j++){
				if(cars[j].carId == indexList[i]){
					
					if(cars[j] instanceof Sedan){
						numCarPassenger++;
					}else if(cars[j] instanceof Pickup){
						numCarPassenger++;
						numCarGood++;
					}else if(cars[j] instanceof Truck){
						numCarGood++;
					}
				}
			}
		}
		
		String[] nameCarPassenger = new String[numCarPassenger];
		String[] nameCarGood      = new String[numCarGood];
		
		int m = 0;
		int n = 0;
		
		for(int i=0; i<indexList.length; i++){
			for(int j=0; j<cars.length; j++){
				if(cars[j].carId == indexList[i]){
					
					if(cars[j] instanceof Sedan){
						nameCarPassenger[m] = cars[j].name;
						m++;
					}else if(cars[j] instanceof Pickup){
						nameCarPassenger[m] = cars[j].name;
						nameCarGood[n] = cars[j].name;
						m++;
						n++;
					}else if(cars[j] instanceof Truck){
						nameCarGood[n] = cars[j].name;
						n++;
					}
				}
			}
		}		
		
		System.out.println("*** Cars with Passenger:");
		for(int m1=0; m1<nameCarPassenger.length; m1++){
			System.out.print(nameCarPassenger[m1]+"  ");
		}
		System.out.println("Total passengers are "+sumPassenger);
		
		System.out.println("*** Cars with Good:");
		for(int n1=0; n1<nameCarGood.length; n1++){
			System.out.print(nameCarGood[n1]+"  ");
		}
		System.out.println("Total goods are "+sumGood);
		
		System.out.println("Total rental fee are: " + sumFee);
		
		
		break;
	case 0:
		System.out.println("Thank you! Goodbye!");
	}
	
	
	
	
	
	}

}
