package com.programming.strings;

public class Permutation {
	public static String swap(String str, int i, int j) {
		char charArray[] = str.toCharArray();
		char temp;
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void permutate(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permutate(str, l + 1, r);
				str = swap(str, l, i);
			}

		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		permutate(str, 0, str.length() - 1);
	}
}
