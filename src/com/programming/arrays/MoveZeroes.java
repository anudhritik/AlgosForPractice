package com.programming.arrays;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int counter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[counter] = nums[i];
				counter++;
			}
		}

		for (int i = counter; i < nums.length; i++) {
			nums[i] = 0;
		}

	}

	public static void main(String[] args) {
		MoveZeroes obj = new MoveZeroes();
		int nums[] = { 0, 1, 0, 3, 12 };
		obj.moveZeroes(nums);
		System.out.println(nums.toString());
	}
}
