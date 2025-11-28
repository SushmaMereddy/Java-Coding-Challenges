package com.practice.Strings;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		String str=" j av a s t ar  ";
//		String trimmedStr=str.trim();
//		System.out.println(trimmedStr);
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
	}

}
