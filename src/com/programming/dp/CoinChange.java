package com.programming.dp;

public class CoinChange {
	public static int coinChange(int[] coins, int amount) {

		int[][] dp = new int[coins.length + 1][amount + 1];

		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 0;
		}

		for (int j = 0; j < dp[0].length; j++) {
			dp[0][j] = Integer.MAX_VALUE - 1;
		}

		 for(int j = 1; j < dp.length; j++){
		 if(j % coins[0] == 0){
		 dp[1][j] = j / coins[0];;
		 } else{
		 dp[1][j] = Integer.MAX_VALUE;
		 }
		 }

		for (int i = 2; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (coins[i - 1] <= j)
					dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
				else
					dp[i][j] = dp[i - 1][j];
			}
		}

		if (dp[coins.length][amount] == Integer.MAX_VALUE - 1)
			return -1;
		
		return dp[coins.length][amount];
	}

	public static void main(String[] args) {
		int[] coins = { 1,2,5 };
		int amount = 11;
		System.out.println(coinChange(coins, amount));
	}
}
