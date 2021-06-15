package com.programming.dp;

public class LongestCommonSubsequenceString {
	public static String lcs(String s1, String s2) {

		int m = s1.length();
		int n = s2.length();

		int dp[][] = new int[m + 1][n + 1];

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

		int i = m;
		int j = n;

		StringBuilder sb = new StringBuilder();

		while (i > 0 && j > 0) {
			if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
				sb.append(s1.charAt(i-1));
				i--;
				j--;
			} else {
				if (dp[i][j - 1] > dp[i - 1][j]) {
					j--;
				} else {
					i--;
				}
			}
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bc";
		System.out.println(lcs(s1, s2));
	}
}
