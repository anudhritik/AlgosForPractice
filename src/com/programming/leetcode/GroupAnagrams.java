package com.programming.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();

		HashMap<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] characters = str.toCharArray();
			Arrays.sort(characters);
			String sorted = new String(characters);
			if(!map.containsKey(sorted)){
				map.put(sorted, new ArrayList<>());
			}
			
			map.get(sorted).add(str);
		}
		
		result.addAll(map.values());
		return result;
	}

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "ate", "bat", "tap", "pat"};
		System.out.println(groupAnagrams(strs));
	}
}
