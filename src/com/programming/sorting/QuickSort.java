package com.programming.sorting;

public class QuickSort {
	public static void sort(int arr[], int l, int h) {
		if (l < h) {
			int pivot = arr[l];
			int i = l;
			int j = h;
			while (i < j) {
				i++;
				while (i <= h && arr[i] < pivot) {
					i++;
				}
				while (j >= l && arr[j] > pivot) {
					j--;
				}
				if (i < j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			int temp = arr[l];
			arr[l] = arr[j];
			arr[j] = temp;

			sort(arr, l, j - 1);
			sort(arr, j + 1, h);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 6, 7, 8, 4, 9, 1, 3, 5 };
		sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
