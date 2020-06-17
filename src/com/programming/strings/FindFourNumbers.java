package com.programming.strings;

public class FindFourNumbers {
	public static void findFour(int arr[], int x, int n) {
		for (int i = 0; i < n - 3; i++) {
			for (int j = i + 1; j < n - 2; j++) {
				for (int k = j + 1; j < n - 1; k++) {
					for (int l = k + 1; l < n; l++) {
						if (arr[i] + arr[j] + arr[k] + arr[l] == x) {
							System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + arr[l]);
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int x = 10;
		int n = arr.length;
		findFour(arr, x, n);
	}
}
