package com.sunbeam;

class Employee extends Person
{
	private int Empid;
	private double Salary;
	
	public Employee()
	{
		
	}
	public Employee(int Empid,double Salary,String Name)
	{
		super(Name);
		this.Empid=Empid;
		this.Salary=Salary;
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
		this.acceptPerson();
		System.out.println("Enter Employee Id = ");
		Empid = sc.nextInt();
		System.out.println("Enter Salary = ");
		Salary = sc.nextDouble();
	}
	
	public void displayEmployee()
	{
		this.displayPerson();
		System.out.println("Empid = "+this.Empid);
		System.out.println("Salary = "+this.Salary);
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Salary=" + Salary + "]";
	}
	
}

