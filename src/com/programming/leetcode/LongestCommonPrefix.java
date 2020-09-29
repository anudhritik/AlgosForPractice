package com.programming.leetcode;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		String longCommonPrefix = "";
		if (strs == null || strs.length == 0) {
			return "";
		}
		/*
		 * if (strs.length == 1) { return strs[0]; }
		 */
		int counter = 0;
		for (char c : strs[0].toCharArray()) {
			for (int i = 1; i < strs.length; i++) {

				if (counter >= strs[i].length() || c != strs[i].charAt(counter)) {
					return longCommonPrefix;
				}
			}
			longCommonPrefix += c;
			counter++;
		}
		return longCommonPrefix;
	}

	public static void main(String[] args) {
		String[] sample = { "flower", "flow" };
		System.out.println(longestCommonPrefix(sample));

	}
}
