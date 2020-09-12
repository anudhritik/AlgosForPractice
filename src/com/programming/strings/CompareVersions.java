package com.programming.strings;

public class CompareVersions {
	public static int compareVersion(String version1, String version2) {

		String[] s1 = version1.split("\\.");
		String[] s2 = version2.split("\\.");

		int maxLength = Math.max(s1.length, s2.length);
		for (int i = 0; i < maxLength; i++) {
			int v1 = i < s1.length ? Integer.parseInt(s1[i]) : 0;
			int v2 = i < s2.length ? Integer.parseInt(s2[i]) : 0;

			if (v1 > v2)
				return 1;
			else if(v1 < v2)
				return -1;
		}

		return 0;
	}
	public static void main(String[] args) {
		String version1 = "7.5.2.4";
		String version2 = "7.5.3";
		System.out.println(compareVersion(version1, version2));	
	}
}
