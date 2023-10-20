package com.sunbeam;

public interface Emp {

	double getSal();
	default double calcIncentives()
	{
		return 0.0;
	}
	
	static double calcTotalIncome(Emp arr[])
	{
		double totalIncome=0.0;
		
		for( Emp ele : arr)
		{
			double salSum = ele.getSal()+ele.calcIncentives();
			totalIncome = totalIncome + salSum;
		}
		return totalIncome;
	}
}
