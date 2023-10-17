package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class TestStudent {

	public static void main(String[] args) {
		Student []arr = new Student[5];
		arr[0] = new Student(10,"Vinayak","Kolhapur",89);
		arr[1] = new Student(45,"Abhi","Fhulewadi",86);
		arr[2] = new Student(32,"Shiva","Fhulewadi",86);
		arr[3] = new Student(66,"Akash","Ichalkaranji",56);
		arr[4] = new Student(21,"Vaibhav","Pune",80);
		
		System.out.println("Before Sorting....");
		for (Student ele : arr) {
			System.out.println(ele);
		}
		
		class StudentCityComparator implements Comparator<Student>
		{
			public int compare(Student s1,Student s2)
			{
				int diff = -s1.getCity().compareTo(s2.getCity()); //"-ve" sign is used for Descending order of Cities
				if(diff==0)
					diff = -Double.compare(s1.getMarks(),s2.getMarks()); //"-ve" sign is used for Descending order of marks.
				if(diff==0)
					diff = s1.getName().compareTo(s2.getName());
				return diff;
			}
		}
		
		StudentCityComparator comparator = new StudentCityComparator();
		Arrays.sort(arr, comparator);
		
		System.out.println("\nAfter Sorting.....");
		for (Student ele : arr) {
			System.out.println(ele);
		}
	}

}
