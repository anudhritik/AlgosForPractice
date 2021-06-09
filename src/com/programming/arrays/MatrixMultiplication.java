package com.programming.arrays;

public class MatrixMultiplication {

	public static int[][] multiply(int A[][], int B[][], int r1, int c1, int c2) {
		int C[][] = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
				System.out.println(C[i][j] + " ");
			}
			System.out.println();
		}
		return C;
	}

	public static void main(String[] args) {

		int A[][] = { { 1, 0 }, { 1, 1 }, { 1, 1 } };
		int B[][] = { { 1, 0, 1, 0 }, { 0, 1, 1, 2 } };
		int r1 = A.length;
		int c1 = A[0].length;
		int r2 = B.length;
		int c2 = B[0].length;
		if (c1 == r2) {
			int C[][] = multiply(A, B, r1, c1, c2);
		} else {
			System.out.println("Matrix Multiplication cannot be done");
		}
	}
}
