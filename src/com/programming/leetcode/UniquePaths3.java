package com.programming.leetcode;

public class UniquePaths3 {

	static int totalPath = 0;

	public static int uniquePathsIII(int[][] grid) {

		int totalZeroes = 0;
		// count total number of zeroes in grid
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 0)
					totalZeroes++;
			}
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					dfs(grid, i, j, totalZeroes);
				}
			}
		}
		return totalPath;
	}

	private static void dfs(int[][] grid, int i, int j, int totalZeroes) {

		if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1 || (grid[i][j] == 2 && totalZeroes != 0)
				|| grid[i][j] == -1 || grid[i][j] == 10)
			return;
		if (grid[i][j] == 2 && totalZeroes == 0)
			totalPath++;

		if (grid[i][j] == 0)
			totalZeroes--;

		int temp = grid[i][j];
		grid[i][j] = 10;

		dfs(grid, i + 1, j, totalZeroes);
		dfs(grid, i - 1, j, totalZeroes);
		dfs(grid, i, j + 1, totalZeroes);
		dfs(grid, i, j - 1, totalZeroes);

		grid[i][j] = temp;
	}

	public static void main(String[] args) {
		int[][] grid = { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 2, -1 } };
		System.out.println(uniquePathsIII(grid));
	}
}
