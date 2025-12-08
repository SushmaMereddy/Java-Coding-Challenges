package com.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfEachCharacter {
	
	public static void main(String[] args) {
		String input="hello";
		
		Map<Character,Integer> map=new HashMap<>();
		char[] chArr=input.toCharArray();
		for(char ch:chArr) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				int value=map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
		
		//Approach-2
		String st="hii";
		Map<Character, Integer> charCountMap = 
				st.chars()
					.mapToObj(c->(char) c)
					.collect(Collectors.groupingBy(
							c->c,
							Collectors.summingInt(c -> 1)
					));
		System.out.println(charCountMap);
	}

}
