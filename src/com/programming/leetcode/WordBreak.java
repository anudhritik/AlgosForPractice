package com.programming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	public static boolean wordBreak(String s, List<String> wordDict) {
		if (s == null || s.length() == 0)
			return false;

		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		for (int i = 0; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && wordDict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}

	public static void main(String[] args) {
		List<String> wordDict = new ArrayList<>();
		wordDict.add("leet");
		wordDict.add("code");
		System.out.println(wordBreak("leetcode", wordDict));
	}
}
