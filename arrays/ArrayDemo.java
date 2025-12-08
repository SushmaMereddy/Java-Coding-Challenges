package com.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		//Creating an array
		int[] arr=new int[3];
		
		//Initializing an array
		arr[0]=100;
		arr[1]=101;
		arr[2]=102;
		//arr[3]=103;ArrayIndexOutOfBoundException
		
		//accessing array values
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);ArrayIndexOutOfBoundException
	}
}
