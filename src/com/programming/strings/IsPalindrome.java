package com.programming.strings;

public class IsPalindrome {
	public static boolean recursivePalindrome(String text, int first, int last) {
		if (first == last) {
			return true;
		}
		if ((text.charAt(first)) != (text.charAt(last))) {
			return false;
		}
		if (first < last) {
			return recursivePalindrome(text, first + 1, last - 1);
		}
		return true;

	}

	public static boolean isPalindromeRecursive(String text) {
		String reverse = text.replaceAll("\\s+", "").toLowerCase();
		return recursivePalindrome(reverse, 0, reverse.length() - 1);
	}

	public static void main(String[] args) {
		if (isPalindromeRecursive("madam")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
