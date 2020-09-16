package com.programming.leetcode;

public class LengthLastWord {

	public static int lengthOfLastWord(String s) {
		String str[] = s.split(" ");
		if(str.length == 0)
			return 0;
		String lastWord = str[str.length - 1];

		return lastWord.length();
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(""));
	} 
}
