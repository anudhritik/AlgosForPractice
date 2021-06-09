package com.programming.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargeGroups {
	public static List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> ans = new ArrayList();
		int start = 0;
		for (int i = 1; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) != s.charAt(start)) {
				if (i - start >= 3) {
					ans.add(Arrays.asList(start, i - 1));
				}
				start = i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(largeGroupPositions("aaa"));
	}
}
