package com.programming.gen;

public class Stack {
	int arr[] = new int[5];
	int top = 0;

	public void push(int data) {
		arr[top++] = data;
	}

	public int pop() {
		int data = arr[top-1];
		top--;
		return data;
	}
	
	public int peek(){
		int data = arr[top-1];
		return data;
	}

	public int size() {
		return top;
	}

	public void show() {
		for (int n : arr) {
			System.out.println(n + " ");
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(50);
		stack.push(10);
		stack.push(40);
		stack.push(60);
		stack.show();
		System.out.println("Popped element is: " +stack.pop());
		System.out.println("Peeked element is: " +stack.peek());
		stack.show();
		System.out.println(stack.size());

	}
}
