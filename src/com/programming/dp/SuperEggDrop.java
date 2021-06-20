package com.programming.dp;

import java.util.Arrays;

public class SuperEggDrop {

	static int[][] dp = new int[101][10001];

	public static int superEggDrop(int k, int n) {
		return solve(k, n);
	}

	private static int solve(int k, int n) {

		if (k == 1)
			return n;

		if (n == 0 || n == 1)
			return n;

		for (int row[] : dp)
			Arrays.fill(row, -1);

		if (dp[k][n] != -1)
			return dp[k][n];

		int min = Integer.MAX_VALUE;
		int low = 1, high = n;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			low = solve(k - 1, mid - 1);
			high = solve(k, n - mid);

			int temp = 1 + Math.max(low, high);

			if (low < high) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

			min = Math.min(min, temp);
		}

		dp[k][n] = min;
		return min;
	}
	
	public static void main(String[] args) {
		superEggDrop(k, n);
	}
	
}
