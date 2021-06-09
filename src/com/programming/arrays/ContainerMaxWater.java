package com.programming.arrays;

public class ContainerMaxWater {

	public static int maxArea(int arr[]) {

		int max = 0;
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int area = (end - start) * Math.min(arr[start], arr[end]);

			if (arr[start] < arr[end]) {
				start++;
			} else {
				end--;
			}
			
			max = Math.max(max, area);
		}

		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(arr));
	}
}
