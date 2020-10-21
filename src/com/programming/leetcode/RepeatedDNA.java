package com.programming.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNA {
	public List<String> findRepeatedDnaSequences(String s) {
		Set<String> seen = new HashSet<>(), repeated = new HashSet<>();
		for (int i = 0; i < s.length() - 9; i++) {
			String subString = s.substring(i, i + 10);
			if (seen.contains(subString)) {
				repeated.add(subString);
			}
			seen.add(subString);
		}
		return new ArrayList<String>(repeated);
	}

	public static void main(String[] args) {
		RepeatedDNA obj = new RepeatedDNA();
		System.out.println(obj.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
	}
}
