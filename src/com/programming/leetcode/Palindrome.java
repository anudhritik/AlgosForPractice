package com.programming.leetcode;

public class Palindrome {
	public static boolean isPalindrome(int x) {
		int reversed = 0;
		int temp = x;
		if (x < 0)
			return false;
		while (x > 0) {
			reversed = reversed * 10 + x % 10;
			x = x / 10;
		}
		if (reversed == temp)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(0));
	}
}
