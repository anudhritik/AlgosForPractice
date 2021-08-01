package com.programming.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharactersHM {
	public static List<String> commonChars(String[] A) {

		List<Map> list = new ArrayList();
		
		for (int i = 0; i < A.length; i++) {
			Map<Character, Integer> map = new HashMap();
			// Iterating over each String in the array
			for (int j = 0; j < A[i].length(); j++) {

				// filling the map with count of each occurrence of alphabets in
				// 1st String
				if(map.containsKey(A[i].charAt(j))){
					
				}

			}

		}

		return null;
	}

	public static void main(String[] args) {
		String[] A = { "bella", "label", "roller" };
		System.out.println(commonChars(A));
	}
}
