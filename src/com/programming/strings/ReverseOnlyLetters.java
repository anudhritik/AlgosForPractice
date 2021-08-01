package com.programming.strings;

public class ReverseOnlyLetters {
	public static String reverseOnlyLetters(String S) {
		char s1[] = S.toCharArray();
		int low = 0;
		int high = s1.length - 1;
		while (low < high) {
			if (!Character.isLetter(s1[low])) {
				low++;
			} else if (!Character.isLetter(s1[high])) {
				high--;
			} else {
				char temp = s1[low];
				s1[low] = s1[high];
				s1[high] = temp;
				low++;
				high--;
			}
		}

		return new String(s1);
	}

	public static void main(String[] args) {
		String sample = "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(sample));
	}
}
