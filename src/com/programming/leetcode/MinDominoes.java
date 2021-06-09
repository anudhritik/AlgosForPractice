package com.programming.leetcode;

public class MinDominoes {
	public int minDominoRotations(int[] A, int[] B) {
		int n = A.length;
		int[] faceA = new int[7];
		int[] faceB = new int[7];
		int[] match = new int[7];

		for (int i = 0; i < n; i++) {
			faceA[A[i]]++;
			faceB[B[i]]++;
			if (A[i] == B[i])
				match[A[i]]++;
		}

		int minRotation = Integer.MAX_VALUE;
		for (int i = 1; i < 7; i++) {
			if (faceA[i] + faceB[i] - match[i] == n) {
				minRotation = Math.min(minRotation, Math.min(faceA[i], faceB[i] - match[i]));
			}
		}

		return minRotation == Integer.MAX_VALUE ? -1 : minRotation;
	}

	public static void main(String[] args) {
		MinDominoes obj = new MinDominoes();
		int[] A = { 2, 1, 2, 4, 2, 2 };
		int[] B = { 5, 2, 6, 2, 3, 2 };
		System.out.println(obj.minDominoRotations(A, B));

	}
}
