package com.programming.arrays;

import java.util.Arrays;

public class TwoSum {
	public static void findSum(int arr[], int n, int x) {
		int l;
		int r;
		Arrays.sort(arr);
		for (int i = 0; i < n - 2; i++) {
			l = i + 1;
			r = n - 1;
			while (l < r) {
				if (arr[i] + arr[l] + arr[r] == x) {
					System.out.println(arr[i] + " " + arr[l] + " " + arr[r]);
					l++;
					r--;
				} else if (arr[i] + arr[l] + arr[r] < x)
					l++;
				else if (arr[i] + arr[l] + arr[r] > x)
					r--;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 9 };
		findSum(arr, arr.length, 11);
	}
}
