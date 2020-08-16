package com.programming.strings;

import java.util.HashMap;

public class CheckAnagramHashMap {
	public static void IsAnagram(String s1, String s2) {
		String newS1 = s1.replaceAll("//s1", "");
		String newS2 = s2.replaceAll("//s1", "");

		boolean status = true;

		if (newS1.length() != newS2.length()) {
			status = false;
		}

		else {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (int i = 0; i < newS1.length(); i++) {
				char key = newS1.charAt(i);
				if (map.containsKey(key)) {
					map.put(key, map.get(key)+1);
				} else {
					map.put(key, 1);
				}
				
			}
			for (int i = 0; i < newS2.length(); i++) {
				char key = newS2.charAt(i);
				if (map.containsKey(key)) {
					map.put(key, map.get(key)-1);
				} else {
					map.put(key, 1);
				}
			}
			for (int value : map.values()) {
				if (value != 0) {
					status = false;
				}
			}
		}

		if (status) {
			System.out.println("S1 and S2 are anagrams");
		} else {
			System.out.println("S1 and S2 are not anagrams");
		}
	}

	public static void main(String[] args) {
		//IsAnagram("nation", "natina");
		IsAnagram("a", "a");
	}
}
