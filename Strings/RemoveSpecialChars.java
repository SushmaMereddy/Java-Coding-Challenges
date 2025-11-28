package com.practice.Strings;

public class RemoveSpecialChars {
	
	public static void main(String[] args) {
		String str="$ja!va$&st@ar";
		String plainStr=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);
	}

}
