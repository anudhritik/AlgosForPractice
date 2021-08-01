package com.programming.arrays;

public class ReverseIntegerOverFlow {
	public static int reverse(int x) {
		boolean flag = false;
		if (x < 0) {
			flag = true;
			x = -x;
		}
		int prevRevNum = 0, revNum = 0;
		while (x != 0) {

			int currentDigit = x % 10;

			revNum = revNum * 10 + currentDigit;

			if ((revNum - currentDigit) / 10 != prevRevNum) {
				return 0;
			}

			prevRevNum = revNum;
			x = x / 10;
		}

		return (flag == true) ? -revNum : revNum;
	}

	public static void main(String[] args) {
		System.out.println(reverse(-321));
	}
}
