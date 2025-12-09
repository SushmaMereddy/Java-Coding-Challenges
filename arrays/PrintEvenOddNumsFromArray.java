package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintEvenOddNumsFromArray {
	
	public static void main(String[] args) {
		int[] arr= {3,1,6,5,4};
		
		System.out.println("===Approach-1===");
		System.out.println("Even numbers: ");
		Arrays.stream(arr).filter(n->n%2==0)
							.forEach(System.out::println);
		System.out.println("Odd numbers: ");
		Arrays.stream(arr).filter(n-> n%2!=0)
							.forEach(System.out::println);
		
		System.out.println("===Approach-2===");
		System.out.println("Even numbers: ");
		int[] even = Arrays.stream(arr).filter(n-> n%2==0)
							.toArray();
		System.out.println(Arrays.toString(even));
		System.out.println("Odd numbers: ");
		int[] odd= Arrays.stream(arr).filter(n->n%2!=0)
							.toArray();
		System.out.println(Arrays.toString(odd));
		
		System.out.println("===Approach-3===");
		 Map<Boolean, List<Integer>> map = 
				 						Arrays.stream(arr)
				 						.boxed()
				 						.collect(Collectors.partitioningBy(n->n%2==0));
		 System.out.println("Even: "+map.get(true));
		 System.out.println("Odd: "+map.get(false));
								
	}

}
