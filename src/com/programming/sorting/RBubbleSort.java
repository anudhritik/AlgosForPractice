package com.programming.sorting;

public class RBubbleSort {

	public static void bubbleSort(int arr[], int n) {
		n = arr.length;
		if (n == 1) {
			return;
		} else {
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		bubbleSort(arr, n - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 4, 5, 8 };
		BubbleSort.bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
