package com.programming.leetcode;

public class DuplicateNumber {
	public static int findDuplicate(int[] nums) {
		int low = 1, high = nums.length - 1;
		while (low <= high) {
			int counter = 0;
			int mid = low + high / 2;
			for (int num : nums) {
				if (num <= mid)
					counter++;
			}
			if (counter <= mid) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return low;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 3, 4, 2, 2 };
		System.out.println(findDuplicate(nums));
	}
}
