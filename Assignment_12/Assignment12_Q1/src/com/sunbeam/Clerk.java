package com.sunbeam;

public class Clerk implements Emp {

	private double salary;
	
	
	public Clerk() {
		super();
	}
	 
	public Clerk(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSal() {
		return this.salary;
	}

	@Override
	public String toString() {
		return "Clerk [salary=" + salary + "]";
	}
	
	

}
