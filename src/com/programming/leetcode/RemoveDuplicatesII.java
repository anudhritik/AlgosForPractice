package com.programming.leetcode;

public class RemoveDuplicatesII {
	public static int removeDuplicates(int[] nums) {
		int count = 2;

		for (int i = 2; i < nums.length; i++) {
			if (nums[i] != nums[count - 2]) {
				nums[count++] = nums[i];
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		System.out.println(removeDuplicates(nums));

	}
}
