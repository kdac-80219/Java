package com.sunbeam;
import java.util.*;
public class CommissionEmployee extends Employee{
	private int grossSales;
	private double commRate;
	Scanner sc = new Scanner(System.in);
	public CommissionEmployee()
	{
		
	}
	
	public CommissionEmployee(String firstName, String lastName, int ssn,int grossSales,double commRate) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commRate = commRate;
	}

	
	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommRate() {
		return commRate;
	}

	public void setCommRate(double commRate) {
		this.commRate = commRate;
	}

	@Override
	public void calculateSalary() {
		System.out.println("Total Salary Of Commission Employee= "+this.commRate*this.grossSales);
		System.out.println();
	}
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter Gross Sales = ");
		this.grossSales = sc.nextInt();
		System.out.println("Enter Commission Rate = ");
		this.commRate = sc.nextDouble();
	}
	
	public String toString()
	{
		return "Employee Details :"+"\n"+super.toString()+"\n"+"Gross Sales ="+this.grossSales+"\n"+"Commission Rate = "+this.commRate; 
	}
	
	
	
	
}
