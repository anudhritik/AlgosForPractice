package com.programming.leetcode;

public class LongestPalindromicSubString {
	static int length = 0, maxLength = 0;

	public static String longestPalindromicSubString(String s) {

		for (int i = 0; i < s.length() - 1; i++) {
			extendPalindrome(s, i, i);
			extendPalindrome(s, i, i + 1);
		}

		return s.substring(length, length + maxLength);
	}

	public static void extendPalindrome(String s, int l, int r) {

		while (l >= 0 && r < s.length()) {
			if (s.charAt(l) == s.charAt(r)) {
				l--;
				r++;
			} else
				break;
		}

		if (r - l - 1 > maxLength) {
			maxLength = r - l - 1;
			length = l + 1;
		}
	}

	public static void main(String[] args) {
		String s = "cbbd";
		System.out.println(longestPalindromicSubString(s));
	}

}
