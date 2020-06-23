package com.programming.sorting;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
					int temp = arr[min];
					arr[min] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 9, 9, 8 };
		SelectionSort.selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
