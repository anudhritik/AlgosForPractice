package com.programming.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidSquare {
	public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
		int[] sides = { getDist(p1, p2), getDist(p1, p3), getDist(p1, p4), getDist(p2, p3), getDist(p2, p4),
				getDist(p3, p4) };

		Map<Integer, Integer> map = new HashMap<>();
		for (int side : sides) {
			map.put(side, map.getOrDefault(side, 0) + 1);
		}

		if (map.size() != 2)
			return false;

		for (int count : map.values()) {
			return count == 2 || count == 4;
		}

		return false;
	}

	private static int getDist(int[] a, int[] b) {
		return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
	}

	public static void main(String[] args) {
		int[] p1 = { 0, 0 }, p2 = { 1, 1 }, p3 = { 1, 0 }, p4 = { 0, 1 };
		System.out.println(validSquare(p1, p2, p3, p4));
	}
}
