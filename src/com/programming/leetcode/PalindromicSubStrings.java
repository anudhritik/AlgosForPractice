package com.programming.leetcode;

public class PalindromicSubStrings {
	public static int countSubstrings(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			// odd length
			count += expandPalindrome(s, i, i);
			// even length
			count += expandPalindrome(s, i, i + 1);
		}
		return count;
	}

	private static int expandPalindrome(String s, int left, int right) {
		int count = 0;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
			count++;
			left--;
			right++;
			}
		return count;
	}

	public static void main(String[] args) {
		String s = "ab";
		//StringBuilder sb = sb.appen
		System.out.println(countSubstrings(s));

	}
}
