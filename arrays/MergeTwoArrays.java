package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrays {
	public static void main(String[] args) {
		
		int[] a= {1, 2, 3}; // length-3
		int[] b= {4, 5, 6}; // length-3
		
		System.out.println("===Approach-1==="); 
		int[] c= new int[a.length+b.length];//3+3=6
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length] = b[i];
		}
		System.out.println(Arrays.toString(c));
		
		System.out.println("===Approach-2===");
		
		int[] mergedArray= IntStream.concat(Arrays.stream(a), Arrays.stream(b))
					.toArray();
		System.out.println(Arrays.toString(mergedArray));
		
		int[] x= {8,2,5};
		int[] y= {4,5,3};
		 
		System.out.println("===Merge and Remove Duplicates===");
		int[] mergedDistinct = IntStream.concat(Arrays.stream(x), Arrays.stream(y))
										.distinct()
										.toArray();
		System.out.println(Arrays.toString(mergedDistinct));
		
		System.out.println("===Merge and Sort arrays===");
		int[] mergedSorted = IntStream.concat(Arrays.stream(x), Arrays.stream(y))
									.sorted()
									.toArray();
		System.out.println(Arrays.toString(mergedSorted));
		
		System.out.println("===Merge String arrays===");
		String[] s= {"A", "B"};
		String[] st= {"C", "D"};
		
		String[] mergedString=Stream.concat(Arrays.stream(s), Arrays.stream(st))
				.toArray(String[]::new);
		System.out.println(Arrays.toString(mergedString));
		
	}
}
