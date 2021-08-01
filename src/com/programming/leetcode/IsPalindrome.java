package com.programming.leetcode;

public class IsPalindrome {
	public static boolean isPalindrome(String s) {
		int l = 0;
		int r = s.length() - 1;
		char[] sArr = s.toCharArray();
		System.out.println(sArr);
		while (l <= r) {
			while (l <= r && !Character.isLetterOrDigit(sArr[l])) {
				l++;
			}
			while (l <= r && !Character.isLetterOrDigit(sArr[r])) {
				r--;
			}
			if (l <= r && (Character.toLowerCase(sArr[l])) != (Character.toLowerCase(sArr[r]))) {
				return false;
			}
			l++;
			r--;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(".,"));
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
}
