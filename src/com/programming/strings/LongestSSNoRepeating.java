package com.programming.strings;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSSNoRepeating {
	public static int lengthOfLongestSubstring(String s) {
		if (s.length() == 0)
			return 0;
		HashSet<Character> set = new HashSet<>();

		int i = 0, j = 0, maxLength = 0;
		while (j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				maxLength = Math.max(maxLength, j - i + 1);
				j++;
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		return maxLength;
	}

	public static int lengthOfLongestSubstringHashMap(String s) {
		if (s.length() == 0)
			return 0;
		HashMap<Character, Integer> map = new HashMap<>();

		int i = 0, j = 0, maxLength = 0;
		while (j < s.length()) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(i, map.get(s.charAt(j)) + 1);
			}
			map.put(s.charAt(j), j);
			maxLength = Math.max(maxLength, j - i + 1);
			j++;
		}
		return maxLength;
	}

	public static void main(String[] args) {
		String s = "abcabcbb";
		// System.out.println(lengthOfLongestSubstring(s));
		System.out.println(lengthOfLongestSubstringHashMap(s));
	}
}
