package com.programming.arrays;

import java.util.Arrays;

public class ArrayReversal {
	public static void reverseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		reverseArray(arr, 0, 3);
		System.out.println("Reversed array: " + Arrays.toString(arr));
	}
}
