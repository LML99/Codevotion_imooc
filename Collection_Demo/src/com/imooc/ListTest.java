package com.imooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	// for save the candidate courses
	public List coursesToSelect;
	
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	// add course to coursesToSelect
	public void testAdd(){
		// create a Course object and add it into List courseToSelect
		Course cr1 = new Course("1", "DataStructure");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println("The added course is " + temp.id + " : "+temp.name);
	
		Course cr2 = new Course("2","CLanguage");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println("The added course is " + temp2.id + " : "+temp2.name);
	
		Course[] course = {new Course("3","CFD"), new Course("4","Aerodynamics")};
		Course[] course2= {new Course("5","Machine Learning"), new Course("6","Database")};
		
		coursesToSelect.addAll(Arrays.asList(course));
		coursesToSelect.addAll(3,Arrays.asList(course2));
		
		Course[] temps = new Course[6];
		for(int i=0; i<coursesToSelect.size(); i++){
			temps[i] = (Course) coursesToSelect.get(i);
			System.out.println(temps[i].id+" : "+temps[i].name+";");
		}
		
	}
	
	public void testGet(){
		System.out.println("There candidate courses are: ");
		for(int i=0; i<coursesToSelect.size(); i++){
			Course cr = (Course) coursesToSelect.get(i);
			System.out.println(cr.id+" : "+ cr.name+";");
		}
	}
	
	public void testIterator(){
		Iterator it = coursesToSelect.iterator();
		System.out.println("There candidate courses(Iterator) are: ");
		while(it.hasNext()){
			Course cr = (Course)it.next();
			System.out.println(cr.id+" : "+ cr.name+";");
		}
	}
	
	public void testForEach(){
		System.out.println("There candidate courses(foreach) are: ");
		for(Object obj:coursesToSelect){
			Course cr = (Course)obj;
			System.out.println(cr.id+" : "+ cr.name+";");
		}
	}
	
	public void testModify(){
		coursesToSelect.set(4, new Course("7","Maozedong"));
	}
	
	public void testRemove(){
		Course cr = (Course)coursesToSelect.get(4);
		System.out.println(cr.id+" : "+cr.name+" will be removed!");
		coursesToSelect.remove(cr);
		System.out.println("remove successfully!");
		testForEach();
	}
	
	
	
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testModify();
		lt.testForEach();
		lt.testRemove();
	}
}
