package com.sunbeam;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class TestBookFileIO {
	

	public static void main(String[] args) {
		int choice ;
		List<Book>BookList = new ArrayList<>();
		Book b;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("**************************************************************");
			System.out.println("0 .EXIT");
			System.out.println("1 .Add new book in list. ");
			System.out.println("2 .Display all books in forward order .");
			System.out.println("3 .Delete at book given index -- list.remove(index).");
			System.out.println("4 .Check if book with given isbn is in list or not.");
			System.out.println("5 .Delete all books in list.");
			System.out.println("6 .Display number of books in list.");
			System.out.println("7 .Sort all books by price in desc order -- list.sort();");
			System.out.println("8 .Save Books in Book.txt");
			System.out.println("9 .Load Books from file");
			System.out.println("**************************************************************");

			System.out.println("Enter Your Choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: b = new Book();
					b.accept();
					BookList.add(b);
					break;
			case 2: if(BookList.size()!=0)
					{
						for (Book book : BookList) {
							System.out.println(book);
						}
					}
					else
					{
						System.out.println("List is empty!!!");
					}
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
			case 8: 
				
				try(FileOutputStream fout = new FileOutputStream("Book.txt"))
				{
					try(DataOutputStream dout = new DataOutputStream(fout))
					{
						for (Book book : BookList) {
							dout.writeUTF(book.getIsbn());
							dout.writeDouble(book.getPrice());
							dout.writeUTF(book.getAuthorName());
							dout.writeInt(book.getQuantity());
						}
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
					break;
			case 9:
				try(FileInputStream fin = new FileInputStream("Book.txt"))
			{
				try(DataInputStream din = new DataInputStream(fin))
				{
					while(true)
					{
						Book book = new Book();
						book.setIsbn(din.readUTF());
						book.setPrice(din.readDouble());
						book.setAuthorName(din.readUTF());
						book.setQuantity(din.readInt());
						
						System.out.println(book);
					}
					
				}
			}
			catch(EOFException eof)
			{
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
					break;
		 }
			
		}while(choice!=0);

	}

}
