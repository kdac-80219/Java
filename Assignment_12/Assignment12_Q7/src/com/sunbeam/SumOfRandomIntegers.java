package com.sunbeam;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfRandomIntegers {

	public static void main(String[] args) {
		
		Random r  = new Random();
		Stream<Integer>strm = Stream.generate(()->r.nextInt(10)).limit(10);
		
		Integer sum = strm.reduce(0,(x,y)->x+y);
		System.out.println("Sum = "+sum);
		
	}

}
