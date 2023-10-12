package com.sunbeam;
import java.util.*;
public class SalariedEmployee extends Employee {

	private double weeklySalary;
	Scanner sc = new Scanner(System.in);
	public SalariedEmployee()
	{
		
	}
	public SalariedEmployee(String firstName,String lastName,int ssn,double weeklySalary)
	{
		super(firstName, lastName, ssn);
		this.weeklySalary=weeklySalary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		
	}
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter Weekly Salary = ");
		this.weeklySalary = sc.nextDouble();
	}
	
	public String toString()
	{
		return "Employee Details :"+"\n"+super.toString()+"\n"+"Weekly Salary Of Salaried Employee= "+this.weeklySalary;
	}
	
}
