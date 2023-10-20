package com.sunbeam;

interface Check<T>
{
	boolean compare(T a,T b);
}
public class GenericInterfaceLambda2 {

	static <T> int countIf(T[]arr,T key,Check<T>che)
	{
		int count=0;
		for(T ele:arr)
		{
			if(che.compare(ele, key))
			{
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		
		Double []arr = {6.2,5.2,1.2,3.5,1.2,3.9,1.2};
		
		Double key = 1.2;
		
		int count = countIf(arr, key, (x,y)->x.equals(y));
		System.out.println("Count of key("+key+") = "+count);
	}

}
