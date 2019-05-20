package com.programming.arrays;

public class SubArraySum {
	public int sum(int arr[], int sum, int n) {

		int currentSum = arr[0], start = 0, i;
		for (i = 0; i < n; i++) {
			while (currentSum > sum && start<i-1) {
				currentSum = currentSum - arr[start];
				start++;
			}
			if (currentSum == sum) {
				int p = i - 1;
				System.out.println("Found the sum between indexes" + p + "and" + i);

				return 1;
			}
			if (i < n) {
				currentSum = currentSum + arr[i];
			}
		}
		System.out.println("Nothing found");
		return 0;
	}

	public static void main(String[] args) {
		SubArraySum obj = new SubArraySum();
		int arr[] = { 1, 2, 1, 1, 2, 3 };
		int n = arr.length;
		int sum = 10;
		obj.sum(arr, sum, n);
	}
}
