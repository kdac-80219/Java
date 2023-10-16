package com.sunbeam;


class Box<T extends Person>
{
	private T obj;
	
	public void setData(T obj)
	{
		this.obj = obj;
	}
	public T getData()
	{
		return this.obj;
	}
	
	public double getTotalSalary()
	{
		return obj.CalculateSalary();
	}
	
	
	
}




public class GenericClassTestQ1 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.acceptEmployee();
		
		Box<Employee> b1 = new Box<>();
		b1.setData(e1);
		System.out.println("Total Salary= "+b1.getTotalSalary());
	
		Salesman s1 = new Salesman();
		s1.acceptSalesman();
		
		Box<Salesman> b2 = new Box<>();
		b2.setData(s1);
		System.out.println("Total Salary= "+b2.getTotalSalary());
		
	}

}
