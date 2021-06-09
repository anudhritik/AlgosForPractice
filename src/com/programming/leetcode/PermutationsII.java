package com.programming.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		boolean[] used = new boolean[nums.length];
		Arrays.sort(nums);
		permute(result, used, nums, new ArrayList<>());
		return result;
	}

	private static void permute(List<List<Integer>> result, boolean[] used, int[] nums, List<Integer> current) {
		if (current.size() == nums.length) {
			result.add(new ArrayList(current));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i])
				continue;
			if (i > 0 && nums[i] == nums[i - 1] && !used[i-1])
				continue;
			used[i] = true;
			current.add(nums[i]);
			permute(result, used, nums, current);
			current.remove(current.size() - 1);
			used[i] = false;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		System.out.println(permuteUnique(nums));
	}
}
