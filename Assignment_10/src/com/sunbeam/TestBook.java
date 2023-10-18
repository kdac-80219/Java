package com.sunbeam;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class TestBook {
	
	public static void main(String[]args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		Book b1;
		List<Book> list = new ArrayList<Book>();
		
		
		do{
			System.out.println("**************************************************************");
			System.out.println("0 .EXIT");
			System.out.println("1 .Add new book in list. ");
			System.out.println("2 .Display all books in forward order using random access .");
			System.out.println("3 .Search a book with given isbn (hint - indexOf())");
			System.out.println("4 .Delete a book at given index");
			System.out.println("5 .Delete a book with given isbn");
			System.out.println("6 .Reverse the list (hint - Collections.reverseList())");
			//System.out.println("7 .Sort all books by price in desc order -- list.sort();");
			System.out.println("**************************************************************");

			System.out.println("Enter Your Choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:b1 = new Book();
				   b1.accept();
				   int getIndex;
				   if(list.contains(b1))
				   {
					   getIndex = list.indexOf(b1);
					   list.get(getIndex).setQuantity(list.get(getIndex).getQuantity()+b1.getQuantity());
					   System.out.println("Quantity Incremented!!!");
				   }
				   else
				   {
					   System.out.println("Book Added!!!");
					   list.add(b1);
				   }
				   break;
			case 2: 
					for (int i=0;i<list.size();i++)
					{
						b1 = list.get(i);
						System.out.println(b1);
					}
					
			
				break;
			
			case 3:String isbn;
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter ISBN to serach = ");
				isbn = sc1.next();
				Book key = new Book();
				key.setIsbn(isbn);
				if(list.contains(key))
				{
					System.out.println("Book present at index = "+list.indexOf(key));
				}
				else
				{
					System.out.println("Book not found!!!");
				}
				break;
			
			case 4: int index;
					System.out.println("Enter index of book you want to delete = ");
					index  = sc.nextInt();
					if(index<=list.size()-1)
					{
						list.remove(index);
						System.out.println("Book Deleted!!!!");
					}
					else
					{
						System.out.println("Enter valid index!!!!");
					}
					
					break;
					
			case 5: String isbn2;
					System.out.println("Enter ISBN number of a book you want to delete = ");
					isbn2 = sc.next();
					Book key2 = new Book();
					key2.setIsbn(isbn2);
					if(list.contains(key2))
					{
						int removeAt = list.indexOf(key2);
						list.remove(removeAt);
						System.out.println("Book Deleted!!!");
					}
					else
						System.out.println("Book not found!!");
					break;
					
			case 6:  
				ListIterator<Book>itr = list.listIterator(list.size());
				while(itr.hasPrevious())
				{
					Book ele = itr.previous();
					System.out.println(ele);
				}
			    break;
			default: System.out.println("Wrong Choice!!!!");
			 	break;
			}
		}while(choice!=0);
		
		System.out.println("THANK YOU... :)");
	}
}	