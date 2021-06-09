package com.programming.leetcode;

public class OddLengthSubArray {
	public static int sumOddLengthSubarrays(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				result += sum;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5, 3 };
		System.out.println(sumOddLengthSubarrays(arr));
	}
}
