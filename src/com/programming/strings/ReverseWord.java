package com.programming.strings;

public class ReverseWord {
	public static void wordReversal(String word) {
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.println(word.charAt(i));
		}
	}

	public static void main(String[] args) {
		wordReversal("word");
	}
}
