package com.programming.strings;

import java.util.Arrays;

public class CheckAnagram {

	public static void IsAnagram(String s1, String s2) {
		String newS1 = s1.replaceAll("//s1", "");
		String newS2 = s2.replaceAll("//s1", "");

		boolean status = true;

		if (newS1.length() != newS2.length()) {
			status = false;
		}

		else {
			char S1Array[] = newS1.toCharArray();
			char S2Array[] = newS2.toCharArray();

			Arrays.sort(S1Array);
			Arrays.sort(S2Array);

			status = Arrays.equals(S1Array, S2Array);
		}
		if (status) {
			System.out.println("S1 and S2 are anagrams");
		} else {
			System.out.println("S1 and S2 are not anagrams");
		}

	}

	public static void isAnagramIterative(String s1, String s2) {
		String newS1 = s1.replaceAll("//s1", "");
		String newS2 = s2.replaceAll("//s1", "");

		boolean status = true;

		if (newS1.length() != newS2.length()) {
			status = false;
		} else {
			char[] s1Array = newS1.toCharArray();
			for (char c : s1Array) {
				int index = newS2.indexOf(c);
				if (index != -1) {
					newS2 = newS2.substring(0, index) + newS2.substring(index + 1, newS2.length());
				} else {
					status = false;
					break;
				}
			}
		}
		if (status) {
			System.out.println("S1 and S2 are anagrams");
		} else {
			System.out.println("S1 and S2 are not anagrams");
		}

	}

	public static void main(String[] args) {
		IsAnagram("On your side", "edis ruoy no");
		isAnagramIterative("On your side", "edis ruoy no");
	}
}
