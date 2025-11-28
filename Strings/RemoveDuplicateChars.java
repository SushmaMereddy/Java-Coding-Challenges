package com.practice.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {
	
	public static void main(String[] args) {
		String str="programming";
		
		//Approach-1 (Using Java-8)
		StringBuilder sb1=new StringBuilder();
		str.chars().distinct().forEach(c-> sb1.append((char)c));
		System.out.println(sb1);
		
		//Approach-2 (Using indexOf() method in String)
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int idx=str.indexOf(ch, i+1);
			if(idx==-1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		//Approach-3 (Using Character Array)
		char[] arr=str.toCharArray();
		StringBuilder sb3=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			boolean repeated=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repeated=true;
					break;
				}
			}
			if(!repeated) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);		
		
		//Approach-4 (Using Set interface)
		
		StringBuilder sb4=new StringBuilder();
		Set<Character> set=new LinkedHashSet();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character c: set) {
			sb4.append(c);
		}
		System.out.println(sb4);
	}
	
	
}
