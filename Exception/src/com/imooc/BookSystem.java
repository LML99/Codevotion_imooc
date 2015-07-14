package com.imooc;
import java.util.Scanner;

public class BookSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book(1, "CL");
		Book b2 = new Book(2, "DS");
		Book b3 = new Book(3, "A");
		
		Book[] books = {b1, b2, b3};
		
		System.out.println("Search books through: 1 - ID   2 - name");
		
		BookSystem bs = new BookSystem();
		Book bbb = new Book();
		
		while(true){
			try{
				int searchMethod = GetMethod();
			    
				switch(searchMethod){
					case 1:	// search by ID
						bbb = bs.GetBookByID(books);
						break;
					case 2: // search by name
						bbb = bs.GetBookByName(books);
						break;
				}
				
				System.out.println("We have that book. The ID of that book is " + bbb.getID() + ". The name is " +
				bbb.getName());
				
				break;
			}catch(InputException e){
				e.printStackTrace();
				System.out.println("Input Errors. Please enter 1 or 2!!!");
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("Other exceptions!!!");
			}
		}
		
		System.out.println("Have a nice day!");
	}
	
	public Book GetBookByID(Book[] books) throws Exception{
		System.out.println("Please enter the ID of the book:");
		Scanner input3 = new Scanner(System.in);
		int bi = input3.nextInt();

		for(int i=0; i<books.length; i++){
			if(bi == books[i].getID()){
				
				return books[i];
			}
		}
		throw new Exception("We do not have the book!");
	}
	
	public Book GetBookByName(Book[] books) throws Exception{
		System.out.println("Please enter the name of the book:");
		Scanner input2 = new Scanner(System.in);
		String bn = input2.next();

		for(int i=0; i<books.length; i++){
			if(bn.equals(books[i].getName())){
				//System.out.println("We have the book you want. It's name is " + books[i].getName());
				return books[i];
			}
		}
		throw new Exception("We do not have the book!");
	}
	
	public static int GetMethod() throws InputException{
		int searchMethod = 0;
		while(true){
			try{
				Scanner input = new Scanner(System.in);
				searchMethod = input.nextInt();
				if(searchMethod != 1 && searchMethod !=2){
					System.out.println("The input must be 1 or 2, please enter again:");
					continue;
				}
				break;
			}catch(Exception e){
				throw new InputException("Input Errors. Please enter 1 or 2 ! ");
			}
		}
		return searchMethod;
	}
}
