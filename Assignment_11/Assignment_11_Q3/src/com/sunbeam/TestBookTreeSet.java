package com.sunbeam;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestBookTreeSet {

	public static void main(String[] args) {
		int choice;
		Set<Book>set = new TreeSet<>();  // TreeSet requires Comparable natural ordering.. 
		Scanner sc = new Scanner(System.in);
		set.add( new Book("ISBN1",1500,"Sameer",10));
		set.add( new Book("ISBN4",1900,"Vinayak",7));
		set.add( new Book("ISBN9",1100,"Rohan",4));
		set.add( new Book("ISBN1",1234,"Nilesh",6)); // 
		//set.add(null);
		
		for (Book book : set) {
			System.out.println(book);
		}
//		
//		Iterator<Book> itr = set.iterator(); 
//		while(itr.hasNext())
//		{
//			Book element = itr.next();
//			System.out.println(element);
//		}
	}
}
