package com.programming.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumOccurences {
	public static boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		Set<Integer> set = new HashSet<>();
		for (int val : map.values()) {
			if (set.contains(val))
				return false;
			else
				set.add(val);
		}

		return true;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2 };
		System.out.println(uniqueOccurrences(arr));
	}
}
