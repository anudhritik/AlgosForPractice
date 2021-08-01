package com.programming.arrays;

import java.util.Arrays;

public class InsertionSort1 {
	public static int[] insertionSort(int[] arr) {
		int n = arr.length - 1;
		// Outer loop keeping track of the original array elements.
		for (int i = 1; i <= n; i++) {
			int key = arr[i];
			// Inner loop which holds the elements that are sorted among themselves until i.
			for (int j = i-1; j >= 0; j--) {
				if (arr[j] > key) {
					// swapping elements between i(j+1) and j;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 7, 17, 2 };
		System.out.println(Arrays.toString(insertionSort(arr)));
	}
}
