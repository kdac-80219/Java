package com.sunbeam;
import java.util.*;
public class TestBookComparator {

	public static void main(String[] args) {
		
		//USING COMPARABLE...
//		Set<Book>set = new TreeSet<>();
//		set.add(new Book("PXNAYSK",1600,"Sameer",8));
//		set.add(new Book("OEUATSK",740,"Vinayak",4));
//		set.add(new Book("AAKLWSK",900,"Abhi",7));
//		set.add(new Book("PAOESSK",900,"Vaibhav",9));
//		set.add(new Book("OEUATSK",600,"John",10));
//		
//		Iterator<Book> itr = set.iterator();
//		while(itr.hasNext())
//		{
//			Book ele = itr.next();
//			System.out.println(ele);
//		}

		//USING COMPARATOR
		class DescOrderPriceComp implements Comparator<Book>
		{
			public int compare(Book b1,Book b2)
			{
				int diff = -Double.compare(b1.getPrice(),b2.getPrice());
				return diff;
			}
		}
		DescOrderPriceComp comp = new DescOrderPriceComp();
		
		TreeSet<Book>set = new TreeSet<>(comp);
		
		set.add(new Book("PXNAYSK",1600,"Sameer",8));
		set.add(new Book("OEUATSK",740,"Vinayak",4));
		set.add(new Book("AAKLWSK",900,"Abhi",7));
		set.add(new Book("PAOESSK",900,"Vaibhav",9));
		set.add(new Book("OEUATSK",600,"John",10));
		
		System.out.println(" Descending order by Price Using Comparator :");
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext())
		{
			Book ele = itr.next();
			System.out.println(ele);
		}
		
		System.out.println("\nReverse Display Using descendingIterator :");
		Iterator<Book>itr2 = set.descendingIterator();
		while(itr2.hasNext())
		{
			Book element  = itr2.next();
			System.out.println(element);
		}
	}

}
