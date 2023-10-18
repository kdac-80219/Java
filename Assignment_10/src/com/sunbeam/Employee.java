package com.sunbeam;
import java.util.*;
class Employee 
{
	private String name;
	private int Empid;
	private double Salary;
	Scanner sc = new Scanner(System.in);
	public Employee()
	{
		
	}
	public Employee(String name,int Empid,double Salary)
	{
		this.name = name;
		this.Empid=Empid;
		this.Salary=Salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	public double CalculateSalary()
	{
		double totalSal = this.Salary*12;
		return totalSal;
	}
	public void acceptEmployee()
	{
		System.out.println("Enter Name = ");
		name = sc.nextLine();
		System.out.println("Enter Employee Id = ");
		Empid = sc.nextInt();
		System.out.println("Enter Salary = ");
		Salary = sc.nextDouble();
	}
	
	public void displayEmployee()
	{
		System.out.println("Name = "+this.name);
		System.out.println("Empid = "+this.Empid);
		System.out.println("Salary = "+this.Salary);
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee)obj;
		int diff = this.Empid  - e1.Empid;
		if(diff==0)
		{
			return true;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Empid=" + Empid + ", Salary=" + Salary + "]";
	}
}

