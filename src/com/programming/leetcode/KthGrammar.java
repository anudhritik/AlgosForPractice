package com.programming.leetcode;

public class KthGrammar {
	public static int kthGrammar(int n, int k) {
		double length = Math.pow(2, n - 1);

		if (n == 1 && k == 1)
			return 0;
		int mid = (int) length / 2;

		if (k <= mid) {
			return kthGrammar(n - 1, k);
		} else {
			if (kthGrammar(n - 1, k - mid) == 0)
				return 1;
			else
				return 0;
		}
	}

	public static void main(String[] args) {
		int n = 3, k = 2;
		System.out.println(kthGrammar(n, k));
	}
}
