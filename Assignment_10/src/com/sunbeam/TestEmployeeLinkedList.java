package com.sunbeam;
import java.util.*;
public class TestEmployeeLinkedList {

	public static void main(String[] args) {
		Employee emp ;
		Scanner sc = new Scanner(System.in);
		LinkedList<Employee>list = new LinkedList<>();
		int choice;
		
		do {
			
			System.out.println("**************************************************************");
			System.out.println("0 .EXIT");
			System.out.println("1 .Add new Employee ");
			System.out.println("2 .Display all Employees");
			System.out.println("3 .Find Employee");
			System.out.println("4 .Delete Employee");
			System.out.println("5 .Sort Employee");
			System.out.println("6 .Edit/Update Employee");
			//System.out.println("7 .Sort all books by price in desc order -- list.sort();");
			System.out.println("**************************************************************");

			System.out.println("Enter Your Choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:emp = new Employee();
				   emp.acceptEmployee();
				   list.addLast(emp);
				   System.out.println("Employee Added!!!!");
				   break;
			
			case 2:
				for (Employee employee : list) {
					System.out.println(employee);
				}
				break;
			case 3: int empid;
					System.out.println("Enter Empid to search = ");
					empid = sc.nextInt();
					Employee e1 = new Employee();
					e1.setEmpid(empid);
					if(list.contains(e1))
					{
						System.out.println("Employee Found at Index = "+list.indexOf(e1));
					}
					else
						System.out.println("Employee not found!!!");
					break;
			case 4:int id;
				   Employee e2 = new Employee();
				   System.out.println("Enter Empid to delete = ");
				   id = sc.nextInt();
				   e2.setEmpid(id);
				   if(list.contains(e2))
				   {
					   int index = list.indexOf(e2);
					   list.remove(index);
					   System.out.println("Employee Deleted!!!!");
				   }
				   else
					   System.out.println("Employee not found!!!!");
				   break;
			case 5:
				ListIterator<Employee>itr = list.listIterator(list.size());
				while(itr.hasPrevious())
				{
					Employee ele = itr.previous();
					System.out.println(ele);
				}
				break;
				
			case 6:
				System.out.println("Enter emp id to be modified: ");
				int id2 = sc.nextInt();
				Employee key = new Employee();
				key.setEmpid(id2);
				int index = list.indexOf(key);
				if(index == -1)
				System.out.println("Employee not found.");
				else {
				Employee oldEmp = list.get(index);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.acceptEmployee();
				list.set(index, newEmp);
				}
				break;
			case 0:System.out.println("EXIT...!");
				   break;
			default:System.out.println("Wrong Choice!!!!");
				   break;
			}
			
		}while(choice!=0);
		System.out.println("THANK YOU  :)");
	}

}
