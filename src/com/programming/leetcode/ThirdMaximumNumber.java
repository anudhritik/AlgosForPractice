package com.programming.leetcode;

import java.util.PriorityQueue;

public class ThirdMaximumNumber {
	public static int thirdMax(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int num : nums) {
			if (pq.size() < 3 && !pq.contains(num)) {
				pq.add(num);
			} else if (num > pq.peek() && !pq.contains(num)) {
				pq.poll();
				pq.add(num);
			}
		}
		if (pq.size() < 3)
			while (pq.size() != 1)
				pq.poll();
		return pq.peek();
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 4, 5 };
		System.out.println(thirdMax(nums));
	}
}
