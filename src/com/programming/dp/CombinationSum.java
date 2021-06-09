package com.programming.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static List<List<Integer>> combinationSum(int cands[], int target) {
		List<List<Integer>>[] dp = new ArrayList[target + 1];
		Arrays.sort(cands);
		for (int i = 1; i <= target; i++) {
			List<List<Integer>> combs = new ArrayList<>();

			for (int j = 0; j < cands.length && cands[j] <= i; j++) {
				if (i == cands[j]) {
					combs.add(Arrays.asList(cands[j]));
				} else {
					for (List<Integer> l : dp[i - cands[j]]) {
						if (cands[j] >= l.get(l.size() - 1)) {
							List<Integer> temp = new ArrayList<Integer>(l);
							temp.add(cands[j]);
							combs.add(temp);
						}
					}
				}
			}

			dp[i] = combs;

		}

		return dp[target];
	}

	public static void main(String[] args) {
		int[] cands = { 2, 3, 6, 7 };
		int target = 7;

		System.out.println(combinationSum(cands, target));
	}
}
