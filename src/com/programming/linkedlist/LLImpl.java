package com.programming.linkedlist;

public class LLImpl {

	Node head;

	public void insert(int value) {
		Node node = new Node();
		node.data = value;
		node.next = null;

		// If the list is empty, make the node as head
		if (head == null) {
			head = node;
			// If the list is not empty, traverse through the list 
			//and insert the node there. 
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			// Insert the new node at the end.
			temp.next = node;
		}
	}

	public void print() {
		Node node = head;

		while (node.next != null) {
			System.out.println(node.data);
			// shifting to the next node.
			node = node.next;
		}
		System.out.println(node.data);
	}

	public static void main(String[] args) {
		LLImpl list = new LLImpl();
		list.insert(1);
		list.insert(2);
		list.insert(3);

		list.print();

	}

}
