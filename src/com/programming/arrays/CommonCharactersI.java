package com.programming.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharactersI {
	public static List<String> commonChars(String[] A) {
		List<String> res = new ArrayList();

		// Base case
		if (A.length == 0 || A == null)
			return res;

		// Create a Hashmap to store the occurrences of 1st String
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < A[0].length(); i++) {
				map.put(A[0].charAt(i), map.getOrDefault(A[0].charAt(i), 0) + 1);
		}

		// Create another Hashmap to store the common strings from previous map
		// and the //current string
		for (int i = 1; i < A.length; i++) {
			Map<Character, Integer> map2 = new HashMap<>();
			for (int j = 0; j < A[i].length(); j++) {
				char c = A[i].charAt(j);
				if (map.containsKey(c))
					map2.put(c, Math.min(map.get(c), map2.getOrDefault(c, 0) + 1));
			}

			map = map2;
		}

		for (char ch : map.keySet()) {
			for (int i = 0; i < map.get(ch); i++) {
				res.add(ch + "");
			}
		}

		return res;
	}

	public static void main(String[] args) {
		//String[] A = { "bella", "label", "roller" };
		String[] A = {"cool","lock","cook"};
		System.out.println(commonChars(A));
	}
}
