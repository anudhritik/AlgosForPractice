package com.programming.strings;

import java.util.Scanner;

public class SentenceReversalByWord {
	public static String sentenceReversal(String input){
		String words[] = input.split(" ");
		String output = "";
		for(int i = words.length-1; i>=0; i--){
			output = output+ words[i] + " ";
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String input = sc.nextLine();
		String output = sentenceReversal(input);
		System.out.println("Output: " +output);
	}
}
