package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TestBookUsingLinkedHash {

	public static void main(String[] args) {
		int choice;
		Set<Book>set = new LinkedHashSet<>();  //Using LinkedHashSet Equals and HashCode() methods are mandetory to write for UserDefined Types. 
		Scanner sc = new Scanner(System.in);
		set.add( new Book("ISBN1",1500,"Sameer",10));
		set.add( new Book("ISBN4",1900,"Vinayak",7));
		set.add( new Book("ISBN9",1100,"Rohan",4));
		set.add( new Book("ISBN1",1234,"Nilesh",6)); //Duplicate ISBN book is not displayed as already one book present in HashSet and hashCode method has given it a HashCode.
		set.add(null);
		set.add(null);
		set.add(null);
		
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
