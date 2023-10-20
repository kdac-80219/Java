package com.sunbeam;

public class TestAllEmployees {

	public static void main(String[] args) {
		
		Emp[]arr = new Emp[3];
		arr[0] = new Manager(10000,2000);
		arr[1] = new Labor(350,100);
		arr[2] = new Clerk(5000);
		
		double totalIncome = Emp.calcTotalIncome(arr);
		System.out.println("Total Income of all Employees = "+totalIncome);
		
	}

}
