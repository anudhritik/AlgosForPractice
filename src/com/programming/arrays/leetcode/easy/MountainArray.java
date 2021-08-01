package com.programming.arrays.leetcode.easy;

public class MountainArray {
	public static boolean validMountainArray(int[] arr) {

		if (arr.length < 3)
			return false;

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			// start of the mountain check, checking if it's incrementing
			if (arr[start + 1] > arr[start])
				start++;
			// decrement check
			else if (arr[end - 1] > arr[end])
				end--;
			else
				break;
		}

		return start != 0 && end != arr.length - 1 && start == end;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 9, 4, 5 };
		System.out.println(validMountainArray(arr));
	}
}
