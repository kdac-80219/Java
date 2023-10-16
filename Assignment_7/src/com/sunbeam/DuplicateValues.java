package com.sunbeam;
import java.util.*;
public class DuplicateValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String  str[] =  {"Sunbeam","Infotech","Karad"};
		String str2[] =  {"Sunbeam","Infotech","Pune"};
		
		//System.out.println("Enter Strings = ");
//		for(int i=0;i<3;i++)
//		{
//			str[i] = sc.next();
//		}
		

		//System.out.println("Enter Strings = ");
//		for(int i = 0;i<3;i++)
//		{
//			str2[i] = sc.next();
//		}
		
		
		for(int j=0;j<3;j++)
		{
			for(int k=0;k<3;k++)
			{
				if(str[j].equals(str2[k]))
				{
					System.out.println("Duplicate String found = " +str[k]);
				}
			}
		}
		
	}

}
