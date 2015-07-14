package com.imooc;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	public List<Course> courses;
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();
	}
	
	public void testAdd(){
		Course cr1 = new Course("1","College Chinese");
		courses.add(cr1);
		// courses.add("I am strange goods.");
		Course cr2 = new Course("2","Java Basics");
		courses.add(cr2);
	}
	
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "I am Child Type!";
		courses.add(ccr);
		
	}
	
	public void testForEach(){
		for(Course cr: courses){
			System.out.println(cr.id+" : "+ cr.name+";");
		}
	}
	public static void main(String[] args){
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
	}
}
