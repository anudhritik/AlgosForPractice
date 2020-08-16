package com.programming.leetcode;

import java.util.HashMap;

class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		HashMap<Character, String> map = new HashMap<Character, String>();
		HashMap<String, Boolean> map2 = new HashMap<String, Boolean>();
		String arr[] = str.split(" ");
		if (arr.length != pattern.length()) {
			return false;
		}

		if (arr == null || pattern == null) {
			return true;
		}
		for (int i = 0; i < arr.length; i++) {
			char p = pattern.charAt(i);
			if (map.containsKey(p)) {
				if (!map.get(p).equals(arr[i])) {
					return false;
				}
			} else {
				if (!map2.containsKey(arr[i])) {
					map.put(p, arr[i]);
					map2.put(arr[i], true);
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
