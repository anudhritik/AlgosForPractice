package com.programming.dp;

public class SuperEggDrop {

	static Integer dp[][] = new Integer[101][10001];

	public static int superEggDrop(int e, int f) {
		return solve(e, f);
	}

	private static int solve(int e, int f) {

		if (e == 1)
			return f;

		if (f == 0 || f == 1)
			return f;

		// If the value was already computed, no need to compute again.
		if (dp[e][f] != null)
			return dp[e][f];

		int min = Integer.MAX_VALUE;

		int low = 1, high = f;

		// Binary Search
		while (low <= high) {
			int mid = low + (high - low) / 2;

			// If egg breaks, we explore bottom floors.
			int goingDown = solve(e - 1, mid - 1);

			// If egg doesn't break, we explore upper floors.
			int goingUp = solve(e, f - mid);

			// Taking max to get the worst attempts from going up and down.
			int temp = 1 + Math.max(goingDown, goingUp);

			if (goingDown < goingUp) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			// Finaly, we need the minimum of those worst attempts earlier.
			min = Math.min(min, temp);
		}

		dp[e][f] = min;
		return min;
	}

	public static void main(String[] args) {
		System.out.println(superEggDrop(2, 6));
	}

}
