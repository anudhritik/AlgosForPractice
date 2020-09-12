package com.programming.strings;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
	public static List<Integer> partitionLabels(String S) {
		int lastIndex[] = new int[26];
		for (int i = 0; i < S.length(); i++)
			lastIndex[S.charAt(i) - 'a'] = i;
		int j = 0;
		int startOfPartition = 0;
		List<Integer> lengthList = new ArrayList<>();
		for (int i = 0; i < S.length(); i++) {
			j = Math.max(j, lastIndex[S.charAt(i) - 'a']);
			if (i == j) {
				lengthList.add(i - startOfPartition + 1);
				startOfPartition = i + 1;
			}
		}
		return lengthList;
	}
	
	public static void main(String[] args) {
		System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
	}

}
