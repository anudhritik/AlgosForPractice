package com.programming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList();
		for (int num : nums) {
			int n = Math.abs(num);
			int index = n - 1;
			if (nums[index] < 0)
				res.add(n);
			nums[index] = -nums[index];
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 1,1,2 };
		System.out.println(findDuplicates(nums));
	}
}
