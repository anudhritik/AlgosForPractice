package com.programming.arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		boolean swap = false;
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j++]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j++];
					arr[j++] = temp;
					swap = true;
				}
			}
			if (!swap)
				break;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
