package com.programming.leetcode;

public class RemoveOuterParantheses {
	public static String removeOuterParantheses(String s) {

		StringBuilder sb = new StringBuilder();

		int counter = 0;

		for (char c : s.toCharArray()) {
			if (c == '(') {
				if (counter > 0) {
					sb.append(c);
				}
				counter++;

			} else {
				if (counter > 1) {
					sb.append(c);
				}
				counter--;

			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(removeOuterParantheses("(()())(())"));
	}
}
