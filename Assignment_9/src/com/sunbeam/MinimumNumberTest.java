package com.sunbeam;

public class MinimumNumberTest {

	public static <T extends Number> T findMinimum(T []arr)
	{
		T min=  arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min.doubleValue()> arr[i].doubleValue())
			{
				min = arr[i];
			}
		}
		
		return min;
	}
	public static void main(String[] args) {
		
		Integer arr[] = {90,41,20,14,60};
		Integer min = findMinimum(arr);
		System.out.println("Minimum = "+min);
		
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMinimum(arr2);
		System.out.println("Minimum = "+min2);

	}
}
