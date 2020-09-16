package com.programming.leetcode;

public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
		int count = 0;

		for (int num : nums) {
			if (num > nums[count]) {
				nums[++count] = num;
			}
		}
		return count + 1;

	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
	}
}
