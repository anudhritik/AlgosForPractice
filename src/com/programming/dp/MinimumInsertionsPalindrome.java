package com.programming.dp;

public class MinimumInsertionsPalindrome {
	public static int minInsertions(String s) {

		StringBuilder sb = new StringBuilder(s);
		String s1 = sb.reverse().toString();

		int lps = lcs(s, s1);

		return s.length() - lps;
	}

	private static int lcs(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		int[][] dp = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			dp[i][0] = 0;
		}

		for (int j = 0; j <= n; j++) {
			dp[0][j] = 0;
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[m][n];
	}

	public static void main(String[] args) {
		String s = "no";
		System.out.println(minInsertions(s));
	}
}
