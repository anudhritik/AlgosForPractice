package com.programming.strings;

public class FizzBuzz {
	public static void check(int n) {
		if (n % 15 == 0) {
			System.out.println("FIZZBUZZ");
		} else if (n % 5 == 0) {
			System.out.println("FIZZ");
		} else if (n % 3 == 0) {
			System.out.println("BUZZ");
		} else{
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		check(1);
	}
}
