package com.programming.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> resultList = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> set : map.entrySet()) {
			if (set.getValue() > nums.length / 3) {
				resultList.add(set.getKey());
			}
		}
		return resultList;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2 };
		System.out.println(majorityElement(nums));
	}
}
