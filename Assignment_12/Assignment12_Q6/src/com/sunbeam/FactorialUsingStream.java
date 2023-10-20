package com.sunbeam;

import java.util.Collection;
import java.util.stream.Stream;

public class FactorialUsingStream {

	public static void main(String[] args) {
		
		int num=6;
		Stream <Integer>strm = Stream.iterate(1, x->x+1).limit(num);  //Factorial of 6
		
		int result = strm.reduce(1,(x,y)->x*y);
		System.out.println("Result = "+result);

	}

}
