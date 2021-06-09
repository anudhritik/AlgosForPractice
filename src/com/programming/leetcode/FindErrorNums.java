package com.programming.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class FindErrorNums {
	public static int[] findErrorNums(int[] nums) {

		int dup = -1, miss = 1;
		HashMap<Integer, Integer> map = new HashMap();

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int i = 1; i <= nums.length; i++) {
			if (map.containsKey(i)) {
				if (map.get(i) == 2) {
					dup = i;
				}
			} else
				miss = i;
		}

		return new int[] { dup, miss };
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4 };
		System.out.println(Arrays.toString(findErrorNums(nums)));
	}
}
