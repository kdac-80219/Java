package com.sunbeam;

import java.util.*;
public class CollectionNullCheck {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		//Collection<String> c = new HashSet<>();
		//Collection<String> c = new LinkedHashSet<>();
		//Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("A");
		c.add("D");
		c.add("E");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
		System.out.println(c.size());

	}

}
