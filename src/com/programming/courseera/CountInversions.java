package com.programming.courseera;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountInversions {

	public static long merge(int arr[], int l, int mid, int r) {

		int lSize = mid - l + 1;
		int rSize = r - mid;

		int lArr[] = new int[lSize];
		int rArr[] = new int[rSize];

		for (int i = 0; i < lSize; i++) {
			lArr[i] = arr[l + i];
		}

		for (int j = 0; j < rSize; j++) {
			rArr[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k = l, swaps = 0;

		while (i < lSize && j < rSize) {
			if (lArr[i] <= rArr[j]) {
				arr[k++] = lArr[i++];
			} else {
				arr[k++] = rArr[j++];
				swaps += (mid + 1) - (l + i);
			}
		}

		while (i < lSize) {
			arr[k++] = lArr[i++];
		}

		while (j < rSize) {
			arr[k++] = rArr[j++];
		}
		return swaps;
	}

	public static long mergeSort(int arr[], int l, int r) {
		long counter = 0;
		int mid = l + ((r - l) / 2);
		if (l < r) {
			counter += mergeSort(arr, l, mid);
			counter += mergeSort(arr, mid + 1, r);
			counter += merge(arr, l, mid, r);
		}
		return counter;
	}

	static void readInputIntoArray(int[] input) {
		BufferedReader br = null;
		int i = 0;
		try {
			String sCurrentLine = null;
			br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\input.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				input[i++] = Integer.parseInt(sCurrentLine);
			}
		} catch (IOException e) {
			System.out.println("exception => " + e);
		}
	}

	public static void main(String[] args) {

		File f = null;
		Scanner scan = null;
		try {
			f = new File("C:\\Users\\user\\Desktop\\input.txt");
			scan = new Scanner(f);
		} catch (Exception e) {
			System.exit(0);
		}

		ArrayList<Integer> x = new ArrayList<Integer>();
		while (scan.hasNext())
			x.add(scan.nextInt());
		int[] ret = new int[x.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = x.get(i).intValue();

		}
		System.out.println(mergeSort(ret, 0, ret.length - 1));
		for (int i = 0; i < ret.length; i++) {
			System.out.println(ret[i]);
		}
	}
}
