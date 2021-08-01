package com.programming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDissappearedNumber {
	public static List<Integer> findDissappearedNumbers(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			while (nums[i] != nums[nums[i] - 1]) {
				int temp = nums[i];
				nums[i] = nums[temp - 1];
				nums[temp - 1] = temp;
			}
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				list.add(i + 1);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDissappearedNumbers(nums));
	}
}
