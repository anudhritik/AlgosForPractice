package com.programming.arrays;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers arr, a lucky integer is an integer 
which has a frequency in the array equal to its value.
Return a lucky integer in the array. 
If there are multiple lucky integers return the largest of them. 
		If there is no lucky integer return -1.*/

public class LuckyInteger {
	public static int luckyInteger(int nums[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int count = -1;
		for (Map.Entry<Integer, Integer> eMap : map.entrySet()) {
			if (eMap.getKey() == eMap.getValue()) {
				count = Math.max(count, eMap.getKey());
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 2, 3, 3, 3 };
		System.out.println(luckyInteger(nums));
	}
}
