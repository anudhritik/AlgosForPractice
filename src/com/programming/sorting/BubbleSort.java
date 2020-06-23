package com.programming.sorting;

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		boolean swapped;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 8 };
		BubbleSort.bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
