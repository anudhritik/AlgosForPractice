package com.programming.sorting;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > key) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = key;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 4, 5, 8, 6, 1 };
		InsertionSort.insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
