package com.programming.leetcode;

public class SubStringWAllThreeCharacters {
	public static int numberOfSubstrings(String s) {
		int ans = 0, aNum = 0, bNum = 0, cNum = 0;

		for (int l = 0, r = 0; r < s.length(); r++) {
			if (s.charAt(r) == 'a')
				aNum++;
			else if (s.charAt(r) == 'b')
				bNum++;
			else if (s.charAt(r) == 'c')
				cNum++;
			while (aNum > 0 && bNum > 0 && cNum > 0) {
				if (s.charAt(l) == 'a')
					aNum--;
				else if (s.charAt(l) == 'b')
					bNum--;
				else if (s.charAt(l) == 'c')
					cNum--;
				l++;
			}

			ans += l;
		}

		return ans;
	}

	public static void main(String[] args) {
		System.out.println(numberOfSubstrings("ab"));
	}
}
