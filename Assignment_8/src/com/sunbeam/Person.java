package com.sunbeam;
import java.util.Scanner;

class Person
{
	private String Name;
	Scanner sc = new Scanner(System.in);
	public Person()
	{
		this.Name = "";
	}
	public double CalculateSalary() {
		
		return 0;
	}
	public Person(String Name)
	{
		this.Name = Name;
	}
	void setName(String name)
	{
		this.Name = name;
	}
	String getName()
	{
		System.out.println("Enter Name = ");
		this.Name = sc.nextLine();
		return this.Name;
	}
	public void acceptPerson()
	{
		System.out.println("Enter Name = ");
		this.Name = sc.next();
	}
	public void displayPerson()
	{
		System.out.println("Name = "+this.Name);
	}
//	abstract public double CalculateSalary();
	@Override
	public String toString() {
		return "Person [Name=" + Name + "]";
	}
	
}