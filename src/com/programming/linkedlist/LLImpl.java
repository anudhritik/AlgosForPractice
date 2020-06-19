package com.programming.linkedlist;

public class LLImpl {

	Node head;

	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		// If the list is empty, make the node as head
		if (head == null) {
			head = newNode;
			// If the list is not empty, traverse through the list
			// and insert the node there.
		} else {
			Node lastNode = head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			// Insert the new node at the end.
			lastNode.next = newNode;
		}
	}

	public void insertAtStart(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;

	}

	public void insertAt(int index, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		Node currentNode = head;
		for (int i = 0; i < index - 1; i++) {
			currentNode = currentNode.next;
		}

		newNode.next = currentNode.next;
		currentNode.next = newNode;

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
		list.insert(4);

		list.insertAtStart(0);

		list.insertAt(3, 3);

		list.print();

	}

}
