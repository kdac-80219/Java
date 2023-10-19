package com.sunbeam;

import java.util.HashSet;
import java.util.*;
public class TestBook {

	public static void main(String[] args) {
		int choice;
		Set<Book>set = new HashSet<>(); //In HashSet<>For UserDefined type it is necessary to override equals() and hashCode() methods.
		Scanner sc = new Scanner(System.in);
		set.add( new Book("ISBN1",1500,"Sameer",10));
		set.add( new Book("ISBN4",1900,"Vinayak",7));
		set.add( new Book("ISBN9",1100,"Rohan",4));
		set.add( new Book("ISBN1",1234,"Nilesh",6)); //Duplicate ISBN book is not displayed as already one book present in HashSet and hashCode method has given it a HashCode.
		
//		for(Book b:set)
//		{
//			System.out.println(b);
//		}
//		
		Iterator<Book> itr = set.iterator(); 
		while(itr.hasNext())
		{
			Book element = itr.next();
			System.out.println(element);
		}
	}

}
