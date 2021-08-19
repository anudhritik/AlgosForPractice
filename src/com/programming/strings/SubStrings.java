package com.programming.strings;

import java.util.HashMap;
import java.util.Map;

public class SubStrings {
	static Map<String, Integer> map = new HashMap<>();
	public static int subStrings(String s){
		
		return backtrack(s);
	}
	
	public static int backtrack(String s){
		
		
		if(map.containsKey(s) || s.length() == 0){
			return 0;
		} else {
			map.put(s, 1);
		}
		
		return 1 + backtrack(s.substring(0, s.length()-1)) + backtrack(s.substring(1, s.length()));
		
	}
	public static void main(String[] args) {
		String s = "aba";
		System.out.println(subStrings(s));
	}
}
