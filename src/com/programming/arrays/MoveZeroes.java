package com.programming.arrays;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int counter = 0;

		for (int num : nums) {
			if (num != 0) {
				nums[counter] = num;
				counter++;
			}

			while (counter < nums.length) {
				nums[counter] = 0;
			}
		}
	}

	public static void main(String[] args) {
		MoveZeroes obj = new MoveZeroes();
		int nums[] = { 0, 1, 0, 3, 12 };
		obj.moveZeroes(nums);
		System.out.println(nums.toString());
	}
}
