package com.programming.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidsCollision {
	public static int[] asteroidCollision(int[] asteroids) {

		Stack<Integer> st = new Stack();
		for (int i = 0; i < asteroids.length; i++) {
			if (st.isEmpty() || asteroids[i] > 0) {
				st.push(asteroids[i]);
			} else {
				while (true) {
					int peek = st.peek();
					if (peek < 0) {
						st.push(asteroids[i]);
						break;
					} else if (peek == -asteroids[i]) {
						st.pop();
						break;
					} else if (peek > -asteroids[i]) {
						break;
					} else {
						st.pop();
						if (st.isEmpty()) {
							st.push(asteroids[i]);
							break;
						}
					}
				}
			}
		}

		int[] result = new int[st.size()];
		for (int i = st.size() - 1; i >= 0; i--) {
			result[i] = st.push(asteroids[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] asteroids = { 10, 2, -5 };
		int result[] = asteroidCollision(asteroids);
		System.out.println(Arrays.toString(result));
	}
}
