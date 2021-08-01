package com.programming.arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static int romanToInt(String s) {
		if (s.length() == 0)
			return 0;

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int sum = 0;

		if (s.length() == 1) {
			return map.get(s.charAt(0));
		}

		sum += map.get(s.charAt(s.length() - 1));

		for (int i = s.length() - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				sum -= map.get(s.charAt(i));
			} else {
				sum += map.get(s.charAt(i));
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		String s = "LVIII";
		System.out.println(romanToInt(s));
	}
}
