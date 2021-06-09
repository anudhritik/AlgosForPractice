package com.programming.strings;

public class RemoveConsecutiveDuplicates {
	public static String recursiveRemoveDup(String str) {
		if (str.isEmpty() || str.length() == 1) {
			return str;
		} else if (str.substring(1, 2).equals(str.substring(0, 1))) {
			return recursiveRemoveDup(str.substring(1));
		} else {
			return str.substring(0, 1) + recursiveRemoveDup(str.substring(1));
		}
	}

	public static void main(String[] args) {
		System.out.println(recursiveRemoveDup("aaabccba"));
		System.out.println(recursiveRemoveDup(""));
		System.out.println(recursiveRemoveDup("aabba"));

	}
}
