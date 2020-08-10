package com.programming.leetcode;

public class SearchInsertPos {
	    public static int searchInsert(int[] nums, int target) {
	        int low = 0;
	        int high = nums.length-1;
	       
	        while(low<=high){
	        	 int mid = low+((high-low)/2);
	            if(nums[mid] == target){
	                return mid;
	            } else if(nums[mid] < target){
	                low = mid+1;
	            } else {
	                high = mid-1;
	            }
	        }
	        return low;
	    }
	    public static void main(String[] args) {
	    	int nums[] = {1,2,4,7};
			System.out.println("Target is at index "+searchInsert(nums, 7));
		}
	}
