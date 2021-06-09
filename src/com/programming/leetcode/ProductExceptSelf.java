package com.programming.leetcode;

import java.util.Arrays;

public class ProductExceptSelf {
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		for (int i = 0; i < n; i++)
			result[i] = 1;
		int left = 1;
		for (int i = 0; i < n; i++) {
			result[i] = result[i] * left;
			left = left * nums[i];
			
		}
		int right = 1;
		for (int i = n-1; i >= 0; i--) {
			result[i] = result[i] * right;
			right = right * nums[i];
		}

		return result;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
}
