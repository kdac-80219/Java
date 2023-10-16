package com.sunbeam;
class Salesman extends Person
{
	private int id;
	private double salary;
	
	public Salesman()
	{
		
	}
	public Salesman(int id,double salary)
	{
		this.id = id;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double CalculateSalary()
	{
		double totalSal = this.salary*12;
		return totalSal;
	}
	public void acceptSalesman()
    {
		super.acceptPerson();
		System.out.println("Enter Salesman ID = ");
		this.id = sc.nextInt();
		System.out.println("Enter Salesman Salary = ");
		this.salary = sc.nextDouble();
    }
	public void displaySalesman()
    {
		super.displayPerson();
		System.out.println("Salesman ID     = "+this.id);
		System.out.println("Salesman Salary = "+this.salary);
    }
	@Override
	public String toString() {
		return "Salesman [id=" + id + ", salary=" + salary + "]";
	}
	
}
