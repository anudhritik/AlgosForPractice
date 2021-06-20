package com.programming.dp;

public class PalindromePartitioningII {
	Integer[][] dp;

	public int minCut(String s) {
		dp = new Integer[s.length()][s.length()];
		return solve(s, 0, s.length() - 1);
	}

	private boolean isPalindrome(String s, int start, int end) {

		// one letter
		if (start == end)
			return true;
		// empty string
		if (start > end)
			return true;
		if (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	private int solve(String s, int i, int j) {

		int min = Integer.MAX_VALUE;

		if (i >= j)
			return 0;

		if (isPalindrome(s, i, j)) {
			dp[i][j] = 0;
			return 0;
		}

		if (dp[i][j] != null) {
			return dp[i][j];
		}

		for (int k = i; k <= j; k++) {
			if (isPalindrome(s, i, k)) {
				int temp = 1 + solve(s, k + 1, j);

				min = Math.min(min, temp);
			}
		}
		dp[i][j] = min;
		return dp[i][j];
	}
}
