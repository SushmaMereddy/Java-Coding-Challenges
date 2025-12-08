package com.Strings;

import java.util.Arrays;

public class SorStringChars {

	public static void main(String[] args) {
		String str="java";
		
		//Approach-1 Without sort() method
		char[] arr=str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println(new String(arr));
		//System.out.println(Arrays.toString(arr));
		
		//Approach-2 using sort() method
		String str2="rock";
		char[] charArray=str2.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
		
	}
}
