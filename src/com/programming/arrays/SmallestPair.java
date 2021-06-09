package com.programming.arrays;

import java.util.Arrays;

public class SmallestPair {
	public static void smallestPair(int arr[]) {
		int n = arr.length;
		boolean swapped = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 2, 5 };
		smallestPair(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]+arr[1]);
	}
}
