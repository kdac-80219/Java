package com.sunbeam;
import java.util.*;
public class BasePlusCommisionEmployee extends Employee {
	private int grossSales;
	private double commRate;
	private double baseSalary;

	Scanner sc = new Scanner(System.in);
	public BasePlusCommisionEmployee()
	{
		
	}
	
	public BasePlusCommisionEmployee(String firstName, String lastName, int ssn, int grossSales,double commRate,double baseSalary) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commRate = commRate;
		this.baseSalary = baseSalary;
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

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void calculateSalary() {
		System.out.println("Total Salary Of Base+Commission Employee = "+((this.commRate*this.grossSales)+this.baseSalary));
		System.out.println();
	}
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter Gross Sales = ");
		this.grossSales = sc.nextInt();
		System.out.println("Enter Commission Rate = ");
		this.commRate = sc.nextDouble();
		System.out.println("Enter Basic Salary = ");
		this.baseSalary = sc.nextDouble();
	}
	
	public String toString()
	{
		return "Employee Details :"+"\n"+super.toString()+"\n"+"Gross Sales ="+this.grossSales+"\n"+"Commission Rate = "+this.commRate; 
	}
	
}
