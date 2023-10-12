package com.sunbeam;

public class TestAssignment5 {

	public static void main(String[] args) {
		
		Employee emp = new SalariedEmployee();
		emp.accept();
		System.out.println(emp);
		System.out.println();
		
		Employee emp2 = new  HourlyEmployee();
		emp2.accept();
		System.out.println(emp2);
		emp2.calculateSalary();
			
		Employee emp3 = new CommissionEmployee();
		emp3.accept();
		System.out.println(emp3);
		emp3.calculateSalary();
	
		Employee emp4 = new BasePlusCommisionEmployee();
		emp4.accept();
		System.out.println(emp4);
		emp4.calculateSalary();
	}

}
