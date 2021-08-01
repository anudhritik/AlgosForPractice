package com.programming.arrays;

public class DominantIndex {
	public static int dominantIndex(int[] nums) {
		int max = nums[0];
		int secondMax = -1;
		int index = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				secondMax = max;
				max = nums[i];
				index = i;
			} else if (nums[i] > secondMax) {
				secondMax = nums[i];
			}
		}
		return max >= 2 * secondMax ? index : -1;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 0, 3, 2 };
		System.out.println(dominantIndex(arr));
	}
}
