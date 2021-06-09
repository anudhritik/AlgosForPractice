package com.programming.strings;

public class ReverseSpecialCharacter {
	static boolean isAlphabetic(char c) {
		return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
	}

	static void reverse(char[] str) {
		int r = str.length - 1, l = 0;
		while (l < r) {
			if (!Character.isAlphabetic(str[l]))
				l++;
			else if (!Character.isAlphabetic(str[r]))
				r--;
			else {
				char temp = str[l];
				str[l] = str[r];
				str[r] = temp;
				l++;
				r--;
			}
		}
	}

	public static void main(String[] args) {
		String input = "Nation1wide";
		char[] rev = input.toCharArray();
		reverse(rev);
		String result = new String(rev);
		System.out.println("Result: " + result);

	}
}
