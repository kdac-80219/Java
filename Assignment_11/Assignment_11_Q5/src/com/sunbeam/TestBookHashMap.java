package com.sunbeam;
import java.util.*;
import java.util.Map.Entry;
public class TestBookHashMap {

	public static void main(String[] args) {
		int choice;
		Book b ;
		Scanner sc = new Scanner(System.in);
		Map<String,Book>map = new HashMap<>();
		
		do{
			System.out.println("**************************************************************");
			System.out.println("0 .EXIT");
			System.out.println("1 .Add new book in Map. ");
			System.out.println("2 .Search a book with given isbn");
			System.out.println("3 .Display all books in forward order using random access. ");
			System.out.println("**************************************************************");

			System.out.println("Enter Your Choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: b = new Book();
					b.accept();
					map.put(b.getIsbn(),b);
				   break;
			case 2: 
					String isbn;
					System.out.println("Enter ISBN to search = ");
					isbn = sc.next();
					Book b1 = map.get(isbn);
					if(b1==null)
					{
						System.out.println("Book Not Found!!!");
					}
					else
					{
						System.out.println("Book Found!!!\nBook Details:");
						System.out.println(b1.toString());
					}
				break;
			
			case 3:Set<Entry<String,Book>>entries = map.entrySet();
					for (Entry<String, Book> entry : entries) {
						System.out.println("ISBN = "+entry.getKey() +"--->Book_Details :"+entry.getValue());
					}
				break;
				
			default: System.out.println("Wrong Choice!!!!");
			 	break;
			}
		}while(choice!=0);
		
		System.out.println("THANK YOU... :)");

	}

}
