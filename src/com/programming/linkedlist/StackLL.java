package com.programming.linkedlist;

public class StackLL {
	public class Node {
		Node next;
		int data;
	}

	Node top;

	public StackLL() {
		this.top = null;
	}

	public void push(int value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.next = top;
		top = newNode;
	}

	public void pop() {
		if (top == null) {
			System.out.println("Stack is empty, nothing to pop");
		} else{
		top = top.next;
		}
	}

	public int peek() {
		if(top != null){
			return top.data;
		} else 
		return -1;
	
		
	}

	public void show() {
		if (top == null) {
			System.out.println("Stack is empty");
		} else {
			Node temp = top;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		StackLL stack = new StackLL();
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.show();
		stack.pop();
		System.out.println(stack.peek());
	}

}
