package com.programming.arrays.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class CheckIfExists {
	public static boolean checkIfExist(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			if (map.containsKey(2 * num) || (map.containsKey(num / 2)) && num % 2 == 0) {
				return true;
			} else {
				map.put(num, 1);
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 7, 11 };
		System.out.println(checkIfExist(arr));
	}
}
