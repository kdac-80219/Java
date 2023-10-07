package com.sunbeam.assignment2;
import java.util.*;

class Employee
{
	Scanner sc = new Scanner(System.in);
	public String firstName;
	public String lastName;
	public double salary;
	
	public Employee()
	{
		this.firstName="";
		this.lastName="";
		this.salary=0.0;
	}
	
	public Employee(String fn,String ln,double salary)
	{
		this.firstName=fn;
		this.lastName=ln;
		if(salary<0)
		{
			this.salary =0.0;
		}
		else
			this.salary=salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
	
		if(salary<0)
		{
			this.salary=0;
		}
		else
			this.salary = salary;
	}
	
	public void accept()
	{
		System.out.println("Enter First Name = ");
		firstName = sc.nextLine();
		System.out.println("Enter Last Name = ");
		lastName = sc.nextLine();
		System.out.println("Enter monthly Salary = ");
		salary = sc.nextDouble();
	}
	
	public void display()
	{
		if(salary<0)
		{
			this.salary=0;
		}
		System.out.println("*****************************************************");
		System.out.println("First Name = "+firstName);
		System.out.println("Last Name = "+lastName);
		System.out.println("Yearly Salary = "+salary*12);
		System.out.println("Yearly Salary after 10% raise = "+(12*salary*11)/10);
		System.out.println("*****************************************************\n");

	}
	
}
public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println("Employee 1 Details :");
		Employee e1 = new Employee();
		e1.accept();
		e1.display();
		
		System.out.println("\nEmployee 2 Details :");
		Employee e2 = new Employee();
		e2.accept();
		e2.display();
	}

}
