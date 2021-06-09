package com.programming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacters {
	public static List<String> commonChars(String[] A) {
		List<String> result = new ArrayList<>();

		for (char c = 'a'; c <= 'z'; c++) {
			int minCount = Integer.MAX_VALUE;
			for (String s : A) {
				int wordCount = 0;
				for (char ch : s.toCharArray()) {
					if (ch == c)
						wordCount++;
				}
				minCount = Math.min(minCount, wordCount);
			}

			for (int i = 0; i < minCount; i++)
				result.add("" + c);
		}

		return result;
	}

	public static void main(String[] args) {
		String[] A = { "bella", "label", "roller" };
		System.out.println(commonChars(A));
	}
}
