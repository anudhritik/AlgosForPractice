package com.programming.arrays;

import java.util.Arrays;

public class InsertionSort {
	public int[] insertionSort(int arr[]) {
		int i, j, key, temp;
		for (i = 1; i < arr.length; i++) {
			j = i - 1;
			key = arr[i];
			while (j >= 0 && key < arr[j]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j--;
			}

		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 1, 2, 4, 3, 7, 8, 9, 10 };
		InsertionSort obj = new InsertionSort();
		obj.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
