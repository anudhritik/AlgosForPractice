package com.programming.strings;

/*Given a non-empty string s, you may delete at most one character. 
Judge whether you can make it a palindrome.*/

public class ValidPalindrome2 {
	public static boolean validPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
				if (s.charAt(start) != s.charAt(end)) {
					return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
				}
				start++;
				end--;
		}
		return true;
	}

	private static boolean isPalindrome(String str, int i, int j) {
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "abca";
		if(validPalindrome(s)){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
