package com.programming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
	public static List<Integer> sequentialDigits(int low, int high) {
		List<Integer> result = new ArrayList<>();

		String digits = "123456789";

		int nLow = String.valueOf(low).length();
		int nHigh = String.valueOf(high).length();

		for (int i = nLow; i <= nHigh; i++) {
			for (int j = 0; j < 10 - i; j++) {
				int num = Integer.parseInt(digits.substring(j, j + i));
				if (num >= low && num <= high) {
					result.add(num);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(sequentialDigits(100, 10000));
	}
}
