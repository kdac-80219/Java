package com.sunbeam.assignment2;
import java.util.*;

 class Invoice
{
	 
	public String partNumber;
	public String partDesription;
	public int quantity;
	public double price;
	public double amount;
	
	Scanner sc = new Scanner(System.in);
	public Invoice()
	{
		this.partNumber="";
		this.partDesription="";
		this.quantity=0;
		this.price=0;
	}
	
	public Invoice(String pn,String pd,int quantity,double price)
	{
		this.partNumber=pn;
		this.partDesription=pd;
		
		if(quantity<0)
		{
			this.quantity=0;
		}
		else
			this.quantity=quantity;
		
		if(price<0)
		{
			this.price=0.0;
		}
		else
			this.price=price;
		
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDesription() {
		return partDesription;
	}

	public void setPartDesription(String partDesription) {
		this.partDesription = partDesription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void accept()
	{
		System.out.println("Enter Part Number = ");
		partNumber = sc.nextLine();
		System.out.println("Enter Part Desciption = ");
		partDesription = sc.nextLine();
		System.out.println("Enter Part Quantity = ");
		quantity = sc.nextInt();
		System.out.println("Enter Part Price = ");
		price = sc.nextDouble();
		
	}
	
	public void display()
	{
	    System.out.println("***************************************");
    	System.out.println("Part Details");
	    System.out.println("***************************************");
		System.out.println("Part Number = "+partNumber);
		System.out.println("Part Desciption = "+partDesription);
		System.out.println("Part Quantity = "+quantity);
		System.out.println("Part Price = "+price);
		System.out.println("Amount = "+price*quantity);
	    System.out.println("***************************************");

	}
	
}
public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice i1 = new Invoice();
		i1.accept();
		i1.display();
	}

}
