package com.programming.strings;

public class MaxPower {
	    public int maxPower(String s) {
	        int count = 1, max = 1;
	        for(int i=1; i<s.length();i++){
	           if(s.charAt(i) == s.charAt(i-1)){
	               count++;
	           } else {
	               count = 1;
	           }
	             max = Math.max(count, max);
	    }
	        return max;
	}
	    public static void main(String[] args) {
			MaxPower obj = new MaxPower();
			System.out.println(obj.maxPower("e"));
		}
}
