package com.programming.strings;

public class Palindrome {
	public static boolean isPalindrome(String s) {
		String reversedString = reverseString(s);
		s = regexChecker(s).toLowerCase();
		if (reversedString.equals(s)) {
			return true;
		}

		return false;
	}

	public static String regexChecker(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		return s;
	}

	public static String reverseString(String s) {
		s = regexChecker(s);
		char s1Array[] = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (!Character.isLetterOrDigit(s1Array[i])) {
				i++;
			} else if (!Character.isLetterOrDigit(s1Array[j])) {
				j++;
			} else {
				char temp = s1Array[i];
				s1Array[i] = s1Array[j];
				s1Array[j] = temp;
				i++;
				j--;
			}
		}

		return new String(s1Array);
	}

	public static boolean isPalindrome1(String s) {

		s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}

		return true;

	}

	public static void main(String[] args) {
		String s = "0P";
		String s1 = "A man, a plan, a canal: Panama";
		//System.out.println(isPalindrome(s));
		//System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome1(s1));
	}
}
