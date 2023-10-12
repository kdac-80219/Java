package com.app.vehicle;
import java.util.*;

public class Vehicle {
	 private  int chaseNo;
	private String color;
	private double price;
	Scanner sc = new Scanner(System.in);
	
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(int chaseNo, String color, double price) {
		super();
		this.chaseNo = chaseNo;
		this.color = color;
		this.price = price;
	}

	public void setChaseNo(int chaseNo) {
		this.chaseNo = chaseNo;
	}
	public int getChaseNo() {
		return chaseNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void accept()
	{
		System.out.println("Enter Chase Number = ");
		this.chaseNo = sc.nextInt();
		System.out.println("Enter Color = ");
		this.color = sc.next();
		System.out.println("Enter the Price = ");
		this.price = sc.nextDouble();
	}
	
	public void display()
	{
		System.out.println(" Chase Number = "+this.chaseNo);
		System.out.println(" Color = "+this.color);
		System.out.println(" Price = "+this.price);
	}
	
	public boolean equals(Object obj) {
		Vehicle veh = (Vehicle) obj;
		if(this.chaseNo == veh.chaseNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return "Chase Number = "+this.chaseNo+"\n"+"Color = "+this.color+"\n"+"Price = "+this.price;
	}
	
}
