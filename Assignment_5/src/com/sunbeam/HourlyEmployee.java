package com.sunbeam;
import java.util.*;
public class HourlyEmployee extends Employee{

	private int wage;
	private int hours;
	Scanner sc = new Scanner(System.in);
	public HourlyEmployee()
	{
		
	}
	public HourlyEmployee(String firstName,String lastName,int ssn,int wage,int hours)
	{
		super(firstName, lastName, ssn);
		this.wage = wage;
		this.hours = hours;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	public void calculateSalary() {
		if(this.hours<=40)
		{
			System.out.println("Total Salary Of Hourly Employee = "+this.wage*this.hours) ;
			System.out.println();
		}
		else if(this.hours>40)
		{
			System.out.println("Total Salary = "+((40*this.wage)+(this.hours-40)*(this.wage*1.5)));
			System.out.println();
		}
			
	}
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter hourly wage = ");
		this.wage = sc.nextInt();
		System.out.println("Enter hours = ");
		this.hours = sc.nextInt();
	}
	
	public String toString()
	{
		return "Employee Details :"+"\n"+super.toString()+"\n"+"Hourly Wage = "+this.wage+"\n"+"Hours = "+this.hours;
	}
	
	
}
