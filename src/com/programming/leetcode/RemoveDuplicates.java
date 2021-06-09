package com.programming.leetcode;

public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
		int count = 1;

		for(int i = 0; i<nums.length;i++){
			if(nums[i] != nums[count-1]){
				nums[count++] = nums[i];
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 4 };
		System.out.println(removeDuplicates(nums));
	}
}
