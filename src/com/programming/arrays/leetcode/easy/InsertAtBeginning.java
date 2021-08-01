package com.programming.arrays.leetcode.easy;

import java.util.Arrays;

public class InsertAtBeginning {
	public static int[] insertAtBeginning(int arr[]) {
		int n = arr.length;
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = 0;
		return arr;
	}

	public static int[] insertAtIndex(int arr[], int index) {
		for (int i = arr.length - 1; i >= index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = 0;
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(insertAtIndex(arr, 1)));
	}
}
