package com.sunbeam;

public class pallindrome {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("HELLO");

		StringBuffer str2 = str.reverse();
		
		if(str2 == str)
		{
			System.out.println("It is a Pallindrome!!!");
		}
		else
		{
			System.out.println("Not a Pallindrome!!!");
		}
	}

}
