package com.programming.leetcode;

public class ConsistentStrings {
	public static int countConsistentStrings(String allowed, String[] words) {
		int count = words.length;
		boolean[] flag = new boolean[26];
		for (char c : allowed.toCharArray()) {
			flag[c - 'a'] = true;
		}

		for (String word : words) {
			for (char c : word.toCharArray()) {
				if (flag[c - 'a'] == false) {
					count--;
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] words = { "n", "eeitfns", "eqqqsfs", "i", "feniqis", "lhoa", "yqyitei", "sqtn", "kug", "z", "neqqis" };
		String allowed = "fstqyienx";
		System.out.println(countConsistentStrings(allowed, words));
	}
}
