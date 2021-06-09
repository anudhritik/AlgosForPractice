package com.programming.arrays;

public class BinarySearchRecursive {
	public static int binarySearch(int arr[], int left, int right, int element) {

		if (right >= left) {
			int mid = (left + right) / 2;

			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] > element) {
				return binarySearch(arr, left, mid - 1, element);
			} else {
				return binarySearch(arr, mid + 1, right, element);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int total = arr.length;
		int element = 4;
		int res = binarySearch(arr, 0, total - 1, element);
		if (res == -1) {
			System.out.println("Element is not found.");
		} else {
			System.out.println("Element is found at: " + res);
		}
	}

}
