package com.programming.leetcode;

public class IslandPerimeter {
	public static int islandPerimeter(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		int perimeter = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == 1) {
					// UP
					if (i == 0 || grid[i - 1][j] == 0)
						perimeter++;
					// LEFT
					if (j == 0 || grid[i][j - 1] == 0)
						perimeter++;
					// DOWN
					if (i == rows - 1 || grid[i + 1][j] == 0)
						perimeter++;
					// RIGHT
					if (j == cols - 1 || grid[i][j + 1] == 0)
						perimeter++;
				}
			}
		}

		return perimeter;
	}

	public static void main(String[] args) {
		int grid[][] = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		System.out.println(islandPerimeter(grid));
	}
}
