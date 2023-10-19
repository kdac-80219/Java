package com.sunbeam;
import java.util.*;
import java.util.Map.Entry;
public class TestStudentLinkedHashMap {

	public static void main(String[] args) {
		int choice;
		Student s;
		Map<Integer,Student>map = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("--------------------------------------------");
			System.out.println("0. EXIT");
			System.out.println("1. Add Student");
			System.out.println("2. Search Student using RollNumber");
			System.out.println("3. Display all Students from Map");
			System.out.println("--------------------------------------------");
			System.out.println("Enter your choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: s = new Student();
					s.accept();
					map.put(s.getRoll(),s);
					System.out.println("Student added!!!!");
					break;
			case 2: int rollNum;
					System.out.println("Enter student roll number to search = ");
					rollNum = sc.nextInt();
					Student s1 = map.get(rollNum);
					if(s1==null)
					{
						System.out.println("Student Not Found!!!!");
					}
					else
					{
						System.out.println("Student Found!!!\nStudent Details:");
						System.out.println(s1.toString());
					}
					break;
			case 3:Set<Entry<Integer,Student>>entries = map.entrySet();
					for (Entry<Integer, Student> entry : entries) {
						System.out.println("Student Details where Roll Number = "+entry.getKey() +" ---> "+entry.getValue());
						System.out.println();
					}
					break;
			case 0:System.out.println("Exit!!!!");
					break;
			default : System.out.println("Wrong Choice!!!!!");
			        break;
			}
			
		}while(choice!=0);

		System.out.println("THANK YOU!!! :)");
	}

}
