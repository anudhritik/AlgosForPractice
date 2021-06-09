package com.programming.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CanFormArray {
	public static boolean canFormArray(int[] arr, int[][] pieces) {

		int n = arr.length;
		Map<Integer, int[]> map = new HashMap<>();
		for (int[] p : pieces) {
			map.put(p[0], p);
		}

		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				int[] p = map.get(arr[i]);
				for (int num : p) {
					if (num == arr[i])
						i++;
					else
						return false;
				}
			} else {
				return false;
			}
			i--;
		}

		return true;
	}

	public static void main(String[] args) {
		int[][] pieces = { { 78 }, { 4, 64 }, { 91 } };
		int[] arr = { 91, 4, 64, 78 };

		System.out.println(canFormArray(arr, pieces));
	}
}
