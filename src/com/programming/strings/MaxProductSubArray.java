package com.programming.strings;

public class MaxProductSubArray {
	
	public static int maxProductArray(int nums[]){
		int maxProduct = nums[0];
		int minProduct = nums[0];
		int result = nums[0];
		
		for(int i  = 1; i < nums.length; i++){
			int currentMax = maxProduct;
			maxProduct = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
			minProduct = Math.min(nums[i], Math.min(currentMax * nums[i], minProduct * nums[i]));
			result = Math.max(result, maxProduct);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int nums[] = {1, -2, -3, 7, 1};
		System.out.println(maxProductArray(nums));
	}
}
