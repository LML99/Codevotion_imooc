package com.imooc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public Map<String, Student> students;
	
	Scanner console = new Scanner(System.in);
	
	
	public MapTest(){
		this.students = new HashMap<String, Student>();
	}
	
	public void testPut(){
		Scanner console = new Scanner(System.in);
		int i=0;
		while(i < 3){
			System.out.println("Please enter ID:");
			String ID = console.next();
			
			Student st = students.get(ID);
			if(st == null){
				System.out.println("Please enter the name:");
				String name = console.next();
				Student newStudent = new Student(ID, name);
				
				students.put(ID, newStudent);
				System.out.println("Successfully add the student: "+ students.get(ID).name);
				i++;
			}else{
				System.out.println("This student's ID is already added");
				continue;  // is this necessary? Not necessary.
			}
		}
	}
	
	public void testKeySet(){
		Set<String> keySet = students.keySet();
		
		System.out.println("The total: " + students.size() + " students.");
		
		for(String stuId : keySet){
			Student st = students.get(stuId);
			if(st != null){
				System.out.println(st.id+"  Student: " + st.name);
			}
		}
	}
	
	public void testRemove(){
		System.out.println("Please enter the ID of a student for removing:");
		Scanner console = new Scanner(System.in);
		while(true){
			System.out.println("Please enter the ID of a student for removing:");
			String ID = console.next();
			Student st = students.get(ID);
			if(st == null){
				System.out.println("The input ID has no student!");
				continue;
			}
			students.remove(ID);
			System.out.println("The student is removed: "+ st.name);
			break;
		}
	}
	
	public void testEntrySet(){
		Set<Entry<String, Student>> entrySet = students.entrySet();
		for(Entry<String,Student> entry: entrySet){
			System.out.println("The Key is: " + entry.getKey());
			System.out.println("The value is: " + entry.getValue().name);
		}
	}
	
	public void testModify(){
		System.out.println("Enter the ID for modifying");
		Scanner console = new Scanner(System.in);
		while(true){
			String stuID = console.next();
			Student student = students.get(stuID);
			if(student == null){
				System.out.println("This ID does not exsit");
				continue;
			}
			System.out.println("This student's name is" + student.name);
			System.out.println("Please enter the new name of student: ");
			String name = console.next();
			Student newStudent = new Student(stuID, name);
			students.put(stuID, newStudent);
			System.out.println("modify successfully!");
			break;
		}
	}
	
	public void testContainsKeyOrValue(){
		System.out.println("please enter the student's ID for searching: ");
		String id = console.next();
		
		System.out.println("The student with ID= " + id + "exists: " + students.containsKey(id));
		
		if(students.containsKey(id) == true){
			System.out.println("The corresponding student's name is " + students.get(id).name);
		}
		
		System.out.println("Please enter the student's name for searching: ");
		String name = console.next();
		
		if(students.containsValue(new Student(null,name)) == true){
			System.out.println("This student exists: " + name);
		}else{
			System.out.println("This student does not exist.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
		
		//mt.testRemove();
		//mt.testEntrySet();
		//mt.testModify();
		//mt.testEntrySet();
		
		mt.testContainsKeyOrValue();
	}

}
