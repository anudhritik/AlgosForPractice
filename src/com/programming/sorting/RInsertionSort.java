package com.programming.sorting;

public class RInsertionSort {
	public static void insertionSort(int arr[], int n) {
		if (n == 1) {
			return;
		} else {
			for (int i = 1; i < n; i++) {
				int value = arr[i];
				int key = i;
				while (key > 0 && arr[key - 1] > value) {
					arr[key - 1] = arr[key];
				}
				arr[key] = value;

			}
			insertionSort(arr, n - 1);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 4, 5, 8, 3 };
		InsertionSort.insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
