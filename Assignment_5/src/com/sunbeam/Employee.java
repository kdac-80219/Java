package com.sunbeam;
import java.util.*;
abstract public class Employee {
	private String firstName;
	private String lastName;
	private int ssn;
	Scanner sc = new Scanner(System.in);
	abstract public void calculateSalary();
	public Employee()
	{
		
	}
	public Employee(String firstName,String lastName,int ssn)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn  = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public void accept()
	{
		System.out.println("Enter First Name = ");
		this.firstName = sc.nextLine();
		System.out.println("Enter Last Name = ");
		this.lastName = sc.nextLine();
		System.out.println("Enter Social Security Number = ");
		this.ssn = sc.nextInt();
	}
	public String toString()
	{
		return "First Name = "+this.firstName+"\n"+"Lats Name = "+this.lastName+"\n"+"Social Security Number = "+this.ssn;
	}
	
}
