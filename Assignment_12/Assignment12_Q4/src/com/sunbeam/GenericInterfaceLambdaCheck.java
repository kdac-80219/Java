package com.sunbeam;

interface Check<T>
{
	boolean compare( T x,T y);
}
public class GenericInterfaceLambdaCheck {

	static <T>int countIf(T[]arr,T key,Check<T>c)
	{
		int count=0;
		for(T ele : arr)
		{
			if(c.compare(ele,key))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		Integer[]arr = {65,90,40,50,90,30};
		Integer key = 50;
		
		int cnt = countIf(arr, 90,(x,y)->x.equals(y));
		System.out.println("COUNT = "+cnt);

	}

}
