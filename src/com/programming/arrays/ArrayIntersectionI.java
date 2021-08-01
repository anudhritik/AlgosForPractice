package com.programming.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayIntersectionI {
	public static int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();

		List<Integer> list = new ArrayList();

		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i])) {
				map.put(nums1[i], map.get(nums1[i]) + 1);
			} else {
				map.put(nums1[i], 1);
			}
		}

		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i])) {
				map.put(nums2[i], map.get(nums1[i]) - 1);
				if (!list.contains(nums2[i])) {
					list.add(nums2[i]);
				}
			}
		}

		int[] res = new int[list.size()];
		for (int k = 0; k < list.size(); k++) {
			res[k] = list.get(k);
		}

		return res;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2, };
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
}
