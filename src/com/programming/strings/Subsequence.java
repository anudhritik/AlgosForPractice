package com.programming.strings;

public class Subsequence {
	public static boolean isSubsequence(String str1, String str2, int a, int b) {

		if (a == 0) {
			return true;
		}
		if (b == 0) {
			return false;
		}
		if (str1.charAt(a-1) == str2.charAt(b-1)) {
			return isSubsequence(str1, str2, a - 1, b - 1);
		} else {
			return isSubsequence(str1, str2, a, b - 1);
		}
	}

	public static void main(String[] args) {
		String str1 = "ram";
		String str2 = "sriram";
		if (isSubsequence(str1, str2, str1.length(), str2.length())) {
			System.out.println("SubSequence");
		} else {
			System.out.println("Not subsequence");
		}
	}
}
