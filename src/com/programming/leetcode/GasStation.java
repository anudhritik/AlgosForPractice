package com.programming.leetcode;

public class GasStation {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int tank = 0;
		int total = 0;
		int index = 0;
		for (int i = 0; i < cost.length; i++) {
			int balance = gas[i] - cost[i];
			tank += balance;
			if (tank < 0) {
				index = i + 1;
				tank = 0;
			}

			total += balance;
		}

		return (total < 0) ? -1 : index;
	}

	public static void main(String[] args) {
		int gas[] = { 3, 3, 4 };
		int cost[] = { 3, 4, 4 };
		System.out.println(canCompleteCircuit(gas, cost));
	}
}
