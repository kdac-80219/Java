package com.sunbeam;

public class ReverseString {

		public static void main(String[] args) {
		String s="Sunbeam";
		String rs="";
		for(int i=s.length()-1;i>=0;i--)
		{
		rs=rs+s.charAt(i);
		}
		System.out.println(rs);
		}


}

