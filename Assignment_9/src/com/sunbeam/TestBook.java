package com.sunbeam;
import java.util.*;
public class TestBook {

	Scanner sc = new Scanner(System.in);
	public static int menu()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("**************************************************************");
		System.out.println("0 .EXIT");
		System.out.println("1 .Add new book in list. ");
		System.out.println("2 .Display all books in forward order .");
		System.out.println("3 .Delete at book given index -- list.remove(index).");
		System.out.println("4 .Check if book with given isbn is in list or not.");
		System.out.println("5 .Delete all books in list.");
		System.out.println("6 .Display number of books in list.");
		System.out.println("7 .Sort all books by price in desc order -- list.sort();");
		System.out.println("**************************************************************");

		System.out.println("Enter Your Choice = ");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		
		int choice=0;
		Book b;
		Scanner sc = new Scanner(System.in);
		ArrayList<Book>BookList = new ArrayList<>();
		
		do{
			switch(choice)
			{
			case 1:b = new Book();
				   b.accept(); 
				   BookList.add(b);
				   break;
			case 2: 
				if(BookList.size()!=0)
				{
					for (Book ele : BookList) 
					{
						System.out.println(ele);
					}
				}
				else
					System.out.println("No Books are present!!!!");
				break;
			
			case 3:int index;
				System.out.println("Enter an index to delete book =");
				index = sc.nextInt();
				BookList.remove(index);
				System.out.println("Book successfully deleted!!!");
				break;
				
			case 4: Book key = new Book();
					String isbn;
					System.out.println("Enter a isbn to search a book =");
					isbn = sc.next();
					key.setIsbn(isbn);
					
					if(BookList.contains(key))
					{
						System.out.println("Book is present!!!");
					}
					else
						System.out.println("Book not present!!!");
					break;
					
			case 5: BookList.clear();
					break;
			case 6:  System.out.println("Total Books = "+BookList.size());
					break;
			case 7:
				class SortBook implements Comparator<Book>
				{
					public int compare(Book b1 , Book b2)
					{
						return -Double.compare(b1.getPrice(), b2.getPrice());
					}
				}
				SortBook comparator = new SortBook();
				BookList.sort(comparator);
				for (Book element : BookList) {
					System.out.println(element);
				}
				break;
			default: System.out.println("Wrong Choice!!!!");
			 	break;
			}
		}while((choice = menu())!=0);
		
		System.out.println("THANK YOU... :)");
	}

}
