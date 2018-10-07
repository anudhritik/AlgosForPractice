package com.programming.strings;

public class StringPermutation {
	public static void PermFinder(String str) {

		PermFinder("", str);
	}

	private static void PermFinder(String perm, String str) {
		if (str == null) {
			return;
		} else if (str.length() == 0) {
			System.out.println(perm);
		}

		for (int i = 0; i < str.length(); i++) {
			PermFinder(perm + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
		}

	}

	public static void main(String[] args) {
		PermFinder("ABCD");
	}
}
