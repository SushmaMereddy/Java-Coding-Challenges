package com.Strings;

public class CharWithOccurance {
	
	public static void main(String[] args) {
		String input="opentext";
		char charToReplace='t';
		//expected output=open1ex2
		
		//check whether this charToReplace is available in given input
		if(input.indexOf(charToReplace)==-1) {
			System.out.println("Given Character not available in input string");
			System.exit(0);
		}
		
		//write logic to replace the charToReplace with occurance
		int cnt=1;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch==charToReplace) {
				input=input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
				cnt++;
			}
		}
		System.out.println(input);
	}

}
