package com.sunbeam;

import java.util.StringTokenizer;

public class CountWords {

	public static void main(String[] args) {
		
				//String str = "http://www.sunbeaminfo.com/";
		
				//String s1 = "sunbeam infotech pune";
				//String s1 = "www.sunbeaminfo.com";
				int count=0;
				String s1 = "https://www.sunbeaminfo.com/placements";
				System.out.println(s1);
				
				//StringTokenizer str = new StringTokenizer(s1);
				//StringTokenizer str = new StringTokenizer(s1,".");
				//StringTokenizer str = new StringTokenizer(s1,":/.");
				StringTokenizer str = new StringTokenizer(s1,":/.",true);
				
				
				while(str.hasMoreTokens()) {
					String token = str.nextToken();
					count++;
					System.out.println(token);
				}
				
				System.out.println("Total Strings = "+count);
		
			
	}

}
