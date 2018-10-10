package com.programming.strings;

import java.util.Stack;

public class BalancedParanthesis {
	
	public static boolean checkBalancedParanthesis(String inputStr) {
		
		boolean flag = false;
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < inputStr.length(); i++) {
			String str = "" + inputStr.charAt(i);

			if (str.equals("(") || str.equals("[") || str.equals("{")) {
				stack.push(str);
			}

			if (str.equals(")") || str.equals("]") || str.equals("}")) {
				if (stack.isEmpty()) {
					return false;
				}
				String top = stack.peek();
				if (str.equals(")") && top.equals("(")) {
					stack.pop();
				}
				if (str.equals("]") && top.equals("[")) {
					stack.pop();
				}
				if (str.equals("}") && top.equals("{")) {
					stack.pop();
				}
			}
		}

		if (inputStr.length() == 0 || stack.isEmpty()) {
			flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {
		String[] input = { "{[}", "[{}{}(([]))]", "" };
		for (String inputs : input) {
			if (checkBalancedParanthesis(inputs)) {
				System.out.println("Balanced");
			} else {
				System.out.println("Unbalanced");
			}
		}
	}
}
