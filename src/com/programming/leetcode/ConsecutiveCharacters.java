package com.programming.leetcode;

public class ConsecutiveCharacters {
	public static int maxPower(String s) {

		int count = 1, maxCount = 1;
		char[] sArr = s.toCharArray();
		char prev = sArr[0];
		for (int i = 1; i < sArr.length; i++) {
			if (sArr[i] == prev) {
				count++;
			} else {
				prev = sArr[i];
				count = 1;
			}
			maxCount = Math.max(maxCount, count);
		}

		return maxCount;
	}

	public static void main(String[] args) {
		String s = "abbcccddddeeeeedcba";
		System.out.println(maxPower(s));
	}
}
