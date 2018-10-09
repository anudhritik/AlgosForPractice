package com.programming.strings;

import java.util.Stack;

public class BalancedParanthesis {
	public static boolean checkBalancedParanthesis(String str) {
		
		boolean flag = false;
		Stack<String> stack = new Stack<String>();

		if (str.length() == 0 || stack.isEmpty()) {
			flag = true;
		}
		
		for (int i = 0; i < str.length(); i++) {
			String inputStr = "" + str.charAt(i);

			if ("(".equals(inputStr) || "[".equals(inputStr) || "{".equals(inputStr)) {
				stack.push(inputStr);
			}

			if (")".equals(inputStr) || "]".equals(inputStr) || "}".equals(inputStr)) {
				String top = stack.peek();
				if (")".equals(inputStr) && "(".equals(top)) {
					stack.pop();
				}
				if ("]".equals(inputStr) && "[".equals(top)) {
					stack.pop();
				}
				if ("}".equals(inputStr) && "{".equals(top)) {
					stack.pop();
				}
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		String[] input = { "{[])}" };
		for (String inputs : input) {
			if (checkBalancedParanthesis(inputs)) {
				System.out.println("Balanced");
			} else {
				System.out.println("Unbalanced");
			}
		}
	}
}
