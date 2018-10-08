package com.programming.strings;

public class StringPermutations {

	public static void swap(char[] a, int i, int j) {
		char temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	public static void StringFinder(char[] str, int index) {
		if (index == str.length - 1) {
			System.out.println(str);
		}
		for (int i = index; i < str.length; i++) {
			swap(str, index, i);
			if (str[i] != str[index] || i == index) {
				StringFinder(str, index + 1);
			}
			swap(str, index, i);
		}
	}

	public static void main(String[] args) {
		String input = "AABC";
		StringFinder(input.toCharArray(), 0);
	}
}
