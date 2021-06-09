package com.programming.leetcode;

public class BackSpaceStringCompare {
	public static boolean backspaceCompare(String S, String T) {
		int i = S.length() - 1;
		int j = T.length() - 1;
		char[] sArr = S.toCharArray();
		char[] tArr = T.toCharArray();
		while (i >= 0 || j >= 0) {
			int count = 0;
			while (i >= 0 && (count > 0 || sArr[i] == '#')) {
				if (sArr[i] == '#')
					count++;
				else
					count--;
				i--;
			}

			while (j >= 0 && (count > 0 || tArr[j] == '#')) {
				if (tArr[j] == '#')
					count++;
				else
					count--;
				j--;
			}

			if (i >= 0 && j >= 0) {
				if (sArr[i] != tArr[j])
					return false;
				else
					i--;
				j--;
			} else {
				if (i >= 0 || j >= 0)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String S = "ab##";
		String T = "#d#";
		System.out.println(backspaceCompare(S, T));
	}
}
