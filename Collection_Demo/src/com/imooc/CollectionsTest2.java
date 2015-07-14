package com.imooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest2 {

	List<String> stringList = new ArrayList<String>();
	
	public void testSort2(){
		Random random = new Random();
		for(int i=0; i<10; i++){
			int sizeString = 1 + random.nextInt(10);
			char[] chars = new char[sizeString];
			String entry;
			do{
				for(int j=0; j<chars.length; j++){
					int k;
					do{
						k = random.nextInt(123);
					}while(!((k>=48&&k<=57) || (k>=65&&k<=90) || (k>=97&&k<=122)));
					chars[j] = (char)k;
				}
				entry = new String(chars);
			}while(stringList.contains(entry));
			stringList.add(entry);
		}
		
		System.out.println("------ before sort -------");
		this.testShow();
		
		Collections.sort(stringList);
		
		System.out.println("------ after sort -------");
		this.testShow();
	}
	
	public void testShow(){
		for(int i=0; i<stringList.size(); i++){
			System.out.println("The element is: " + stringList.get(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest2 ct2 = new CollectionsTest2();
		ct2.testSort2();
		//ct2.testShow();
		
		System.out.println("End!");
		
	}

}
