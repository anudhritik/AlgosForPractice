package com.programming.strings;

public class MinimumCharPalindrome {
	static int count = 0;
	static boolean flag;

	public static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;

		if (start == end) {
			return true;
		}
		if (str.charAt(start) != str.charAt(end)) {
			return false;
		}
		while (start <= end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "Madammm";
		str = str.toLowerCase();
		while (str.length() > 0) {
			if (isPalindrome(str)) {
				flag = true;
				break;
			} else {
				count++;
				str = str.substring(0, str.length() - 1);
			}
		}
		if (flag) {
			System.out.println("Minimum Number of characters " + "needed to make input string Palindrome is: " + count);
		}
	}
}
