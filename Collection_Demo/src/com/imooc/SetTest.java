package com.imooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

	public List<Course> coursesToSelect;
	private Scanner console;
	public Student student;
	
	// Constructor
	public SetTest(){ 
		coursesToSelect = new ArrayList<Course>();
		console = new Scanner(System.in);
	}
	
	public void testAdd(){
		// create a Course object and add it into List courseToSelect
		Course cr1 = new Course("1", "DataStructure");
		coursesToSelect.add(cr1);
	
		Course cr2 = new Course("2","CLanguage");
		coursesToSelect.add(0,cr2);
	
		Course[] course = {new Course("3","CFD"), new Course("4","Aerodynamics")};
		Course[] course2= {new Course("5","Machine Learning"), new Course("6","Database")};
		
		coursesToSelect.addAll(Arrays.asList(course));
		coursesToSelect.addAll(3,Arrays.asList(course2));
		}
	

	public void testForEach(){
		System.out.println("There candidate courses(foreach) are: ");
		for(Object obj:coursesToSelect){
			Course cr = (Course)obj;
			System.out.println(cr.id+" : "+ cr.name+";");
		}
	}
	
	public void testListContains(){
		Course course = coursesToSelect.get(0);
		System.out.println("The selected course is" + course.name);
		System.out.println("Wether the candidate course list contains the course" + course.name + ", "
				+ coursesToSelect.contains(course));
		
		
		
		System.out.println("Please enter name of course:");
		String name = console.next();
		
		Course course2 = new Course();
		course2.name = name;
		System.out.println("The new created course is " + course2.name);
		System.out.println("Wether the candidate course list contains the course" + course2.name + ", "
				+ coursesToSelect.contains(course2));
		if(coursesToSelect.contains(course2) == true){
			System.out.println("The index of that course is " + coursesToSelect.indexOf(course2));
		}
		
	}

	public void testForEachForSet(Student student){
		System.out.println("The total number is "+student.courses.size());
		for(Course cr : student.courses){
			System.out.println("The selected course is "+ cr.id+" : "+cr.name+" ; ");
		}
	}
	
	public void creatStudentAndAddCourse(){

		student = new Student("1","XiaoMing");
		System.out.println("Welcome student: "+student.name+" to select courses.");
		Scanner console = new Scanner(System.in);
		
		for(int i=0; i<3; i++){
			System.out.println("Please enter the ID of courses:");
			String courseId = console.next();
			for (Course cr : coursesToSelect){
				if(cr.id.equals(courseId)){
					student.courses.add(cr);
				}
			}
		}
	}
	
	public void testSetContains(){
		System.out.println("Please enter name of course:");
		String name = console.next();
		
		Course course2 = new Course();
		course2.name = name;
		System.out.println("The new created course is " + course2.name);
		System.out.println("Wether the candidate course list contains the course" + course2.name + ", "
				+ student.courses.contains(course2));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();

		st.testListContains();
		
		//st.creatStudentAndAddCourse();
		//st.testSetContains();
		st.testForEach();
		
	}
	
	
		
		
}
