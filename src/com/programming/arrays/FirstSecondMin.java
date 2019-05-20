package com.programming.arrays;

public class FirstSecondMin {
		public static int findSum(int arr[], int n){
			int min = Integer.MAX_VALUE;
			int secondMin = Integer.MAX_VALUE;
			n = arr.length;
			for(int i=0;i<n;i++){
				if(arr[i]<min){
					secondMin = min;
					min=arr[i];
				} else if(arr[i]<secondMin && arr[i]!=min){
					secondMin =arr[i];
				}
			}
			System.out.println(min);
			System.out.println(secondMin);
			return (min+secondMin);
		}
		
		public static void main(String[] args) {
			int arr[] = {5,3,2,1,2};
			System.out.println(findSum(arr,arr.length)); 
		}
}
