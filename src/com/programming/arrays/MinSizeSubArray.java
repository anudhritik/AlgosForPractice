package com.programming.arrays;

public class MinSizeSubArray {
	public static int minSubArrayLen(int target, int[] nums) {
		int currSum = 0;
		int minLen = Integer.MAX_VALUE;
		int start = 0;
		int end = 0;
		
		while(start < nums.length){
			if(currSum < target && end < nums.length){
				currSum += nums[end];
				end++;
			} else if(currSum >= target){
				minLen = Math.min(minLen, end-start);
				currSum -= nums[start];
				start++;
			} else {
				break;
			}
		}
		
		return (minLen== Integer.MAX_VALUE) ? 0 : minLen;
	}
	public static void main(String[] args) {
		int nums[] = {2,3,1,2,4,3};
		int target = 7;
		System.out.println(minSubArrayLen(target, nums));
	}
}
