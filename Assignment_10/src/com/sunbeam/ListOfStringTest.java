package com.sunbeam;
import java.util.*;
public class ListOfStringTest {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<>();
		list.add("Sunbeam infotech Pune ");
		list.add("Sunbeam karad");
		list.add("Sunbeam Infotech");

		
	
		
		class FindHighestLength implements Comparator<String>
		{
			public int compare(String s1,String s2)
			{
				int diff = s1.length() - s2.length();
				return diff;
			}
		}
		FindHighestLength comparator = new FindHighestLength();
		String max = Collections.max(list,comparator);
	
		System.out.println("Highest Length String = "+max);
		
	}

}
