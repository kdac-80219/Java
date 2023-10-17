package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class SelectionSortTest{

	static <T> void selectionSort(T[] arr, Comparator<T> c)
	{
		for(int i=0; i<arr.length-1; i++) 
		{
			for(int j=i+1; j<arr.length; j++) 
			{
				if(c.compare(arr[i], arr[j]) > 0) 
				{
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		SelectionSortTest s1 = new SelectionSortTest();
		SelectionSortTest s2 = new SelectionSortTest();
		
		Double arr[] = {1.1,8.6,2.4,1.05,7.6,2.35};
		
		
		
		class SortDouble implements Comparator<Double>
		{
			public int compare(Double d1,Double d2)
			{
				int diff = d1.compareTo(d2);
				return diff;
			}
		}
		SortDouble comparator = new SortDouble();
		selectionSort(arr,comparator);
		System.out.println("After Sorting....");
		for (Double d : arr) 
		{
			System.out.println(d);
		}
	}




}
