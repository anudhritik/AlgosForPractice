package com.programming.dp;

public class TargetSum {
	public static int findTargetSumWays(int[] nums, int target) {

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		int sumRed = sum + target;

		if (sum < target || sumRed % 2 == 1) {
			return 0;
		}

		return countNumberOfSubsets(nums, sumRed / 2);
	}

	private static int countNumberOfSubsets(int[] nums, int target) {

		int[][] dp = new int[nums.length + 1][target + 1];

		/*for (int i = 0; i <= nums.length; i++) {
			dp[i][0] = 1;
		}

		for (int j = 0; j <= target; j++) {
			dp[0][j] = 1;
		}*/
		
		dp[0][0] = 1;

		for (int i = 1; i <= nums.length; i++) {
			for (int j = 0; j <= target; j++) {
				if (nums[i - 1] <= j) {
					dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[nums.length][target];
	}

	public static void main(String[] args) {
		int nums[] = { 1,1,1,1,1 };
		int target = 3;
		System.out.println(findTargetSumWays(nums, target));
	}
}
