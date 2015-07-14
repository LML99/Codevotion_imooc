package com.imooc;

public class Book {
	
	private int ID;
	private String name;
	
	public Book(int ID, String name){
		this.ID = ID;
		this.name = name;
	}
	
	public Book(){}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
}
