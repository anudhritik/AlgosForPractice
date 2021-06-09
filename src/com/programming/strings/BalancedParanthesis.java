package com.programming.strings;

import java.util.Stack;

public class BalancedParanthesis {
	
	public static boolean checkBalancedParanthesis(String inputStr) {
		
		boolean flag = false;
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < inputStr.length(); i++) {
			

			if (inputStr.charAt(i) == '(' || inputStr.charAt(i) == '('|| inputStr.charAt(i) == '{') {
				stack.push(inputStr.charAt(i));
			}

			if (inputStr.charAt(i) == (')') || inputStr.charAt(i) == (']') || inputStr.charAt(i) == ('}')) {
				if (stack.isEmpty()) {
					return false;
				}
				Character top = stack.peek();
				if (inputStr.charAt(i) == (')') && top.equals("(")) {
					stack.pop();
				}
				if (inputStr.charAt(i) == (']') && top.equals("[")) {
					stack.pop();
				}
				if (inputStr.charAt(i) == ('}') && top.equals("{")) {
					stack.pop();
				}
			}
		}

		if (inputStr.length() == 0 || stack.empty()) {
			flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {
		String[] input = { "{)", "[{}{}(([]))]", "{(([])[])[]]}" };
		for (String inputs : input) {
			if (checkBalancedParanthesis(inputs)) {
				System.out.println("Balanced");
			} else {
				System.out.println("Unbalanced");
			}
		}
	}
}
