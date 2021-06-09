package com.programming.dp;

public class EqualSumPartition {
	public static boolean canPartition(int[] nums) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		if (sum % 2 != 0) {
			return false;
		}

		return subsetSum(nums, sum / 2);
	}

	private static boolean subsetSum(int[] nums, int sum) {
		boolean dp[][] = new boolean[nums.length + 1][sum + 1];

		dp[0][0] = true;
		for (int i = 0; i < nums.length + 1; i++)
			dp[i][0] = true;

		for (int j = 0; j < sum + 1; j++)
			dp[0][j] = false;

		for (int i = 1; i < nums.length + 1; i++) {
			for (int j = 1; j < sum + 1; j++) {

				if (nums[i - 1] <= j) {
					dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[nums.length][sum];
	}

	public static void main(String[] args) {
		int nums[] = { 1, 5, 11, 5 };
		System.out.println(canPartition(nums));
	}
}
