package com.programming.sorting;

public class MergeSort {
	public static void merge(int arr[], int l, int mid, int h) {
		// create temp arrays
		int lSize = mid - l + 1;
		int rSize = h - mid;
		int lArray[] = new int[lSize];
		int rArray[] = new int[rSize];

		// copying data into temp arrays
		for (int i = 0; i < lSize; i++) {
			lArray[i] = arr[l + i];
		}

		for (int j = 0; j < rSize; j++) {
			rArray[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k = l;

		while (i < lSize && j < rSize) {
			if (lArray[i] <= rArray[j]) {
				arr[k++] = lArray[i++];
			} else {
				arr[k++] = rArray[j++];
			}
		}
		// copying over remaining elements.
		while (i < lSize) {
			arr[k++] = lArray[i++];
		}
		while (j < rSize) {
			arr[k++] = rArray[j++];

		}
	}

	public static void mergeSort(int arr[], int l, int h) {
		int mid = (l + h) / 2;
		if (l < h) {
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, h);
			merge(arr, l, mid, h);

		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 6, 8, 9, 3, 7, 1, 13, 5, 10, 7 };
		for (int i = 0; i < arr.length; i++) {
			mergeSort(arr, 0, arr.length-1);
			System.out.println(arr[i]);
		}
	}
}
