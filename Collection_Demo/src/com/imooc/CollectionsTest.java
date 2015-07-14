package com.imooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {

	public void testSort1(){
		List<Integer> integerList = new ArrayList<Integer>();
		Random random = new Random();
		Integer k;
		
		for(int i=0; i<10; i++){
			do{
				k = random.nextInt(100);

			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("The added element is: " + k);
		}
		
		System.out.println("---------- Before Sort ----------");
		for(Integer integer : integerList){
			System.out.println("The element is: " + integer);
		}
		
		Collections.sort(integerList);
		
		System.out.println("---------- After Sort ----------");
		for(Integer integer : integerList){
			System.out.println("The element is: " + integer);
		}
	}
	
	public void testSort2(){
		List<String> stringList = new ArrayList<String>();
		stringList.add("microsoft");
		stringList.add("google");
		stringList.add("lenovo");
		
		System.out.println(" ------- before sort ------");
		for(String string : stringList){
			System.out.println("element:" + string);
		}
		
		Collections.sort(stringList);
		
		System.out.println(" ------- after sort ------");
		for(String string : stringList){
			System.out.println("element:" + string);
		}
	}
	
	public void testSort3(){
		List<Student> studentList = new ArrayList<Student>();
		Random random = new Random();
		
		studentList.add(new Student(String.valueOf(random.nextInt(1000)),"Feilin"));
		studentList.add(new Student(String.valueOf(random.nextInt(1000)),"Meining"));
		studentList.add(new Student(String.valueOf(random.nextInt(1000)),"Xiaolin"));
		
		System.out.println("-------- before sort ---------");
		for(Student st : studentList){
			System.out.println("Student: " + st.id +" : " + st.name);
		}
		
		Collections.sort(studentList);
		
		System.out.println("-------- after sort ---------");
		for(Student st : studentList){
			System.out.println("Student: " + st.id +" : " + st.name);
		}
		
		Collections.sort(studentList, new StudentComparator());
		
		System.out.println("-------- after sort by names ---------");
		for(Student st : studentList){
			System.out.println("Student: " + st.id +" : " + st.name);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest ct = new CollectionsTest();
		//ct.testSort1();
		//ct.testSort2();
		ct.testSort3();
		
			
	}

}
