package com.programming.courseera;

public class CountComparisons {
	public static int lastEleAsPivot(int arr[], int start, int end) {
		// choosing last element as pivot
		int x = arr[end];
		int i = start - 1;

		for (int j = start; j < end; j++) {
			if (arr[j] < x) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i + 1] = arr[end];
		arr[end] = temp;
		return i + 1;
	}

	public static void quickSort(int arr[], int start, int end) {
		if (start < end) {
			int q = lastEleAsPivot(arr, start, end);
			quickSort(arr, start, q - 1);
			quickSort(arr, q + 1, end);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {5,8,3,6,4,7};
		for (int i = 0; i < arr.length; i++) {
			quickSort(arr, 0, arr.length - 1);
			System.out.println(arr[i]);
		}
		
	}

}
