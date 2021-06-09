package com.programming.leetcode;

public class ReplaceDigits {
	public static String replaceDigits(String s) {
		char[] cArray = s.toCharArray();
		for (int i = 1; i < cArray.length; i = i + 2) {
			cArray[i] = (char) (cArray[i - 1] + cArray[i] - '0');
		}

		return String.valueOf(cArray);
	}

	public static void main(String[] args) {
		System.out.println(replaceDigits("a2b1c1"));
	}
}
