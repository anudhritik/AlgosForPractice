package com.programming.leetcode;

public class MaxSubArrayNaive {
	public static int maxSubArray(int[] nums) {
		int sum = Integer.MIN_VALUE;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (sum < 0) {
				sum = nums[i];
			} else {
				sum = sum + nums[i];
			}

			maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int nums[] = { 5, 4, -1, 7, 8 };
		System.out.println(maxSubArray(nums));
	}
}
