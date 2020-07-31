package com.programming.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int length;

	public class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

	}

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int length() {
		return length;
	}

	public void printDL() {
		if (head == null)
			return;
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "--");
			temp = temp.next;
		}
	}

	public void printReverseDL() {
		if (tail == null)
			return;
		Node temp = tail;
		while (temp != null) {
			System.out.println(temp.data + "--");
			temp = temp.prev;
		}
	}

	public void insertFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.prev = newNode;
		}

		newNode.next = head;
		head = newNode;
		length++;
	}

	public void insertLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		newNode.prev = tail;
		tail = newNode;
		length++;
	}

	public void insertMiddle(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node slow = head;
			Node fast = head.next;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			newNode.next = slow.next;
			slow.next = newNode;
			length++;
		}
	}

	public Node deleteFirst() {
		if (isEmpty())
			throw new NoSuchElementException();
		Node temp = head;
		if (head == tail) {
			tail = null;
		} else {
			// break the link that is coming from the node next to head.
			head.next.prev = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}

	public Node deleteLast() {
		Node temp = tail;
		if (isEmpty())
			throw new NoSuchElementException();
		if (head == tail) {
			head = null;
		} else {
			tail.prev.next = null;
		}

		tail = tail.prev;
		temp.prev = null;
		length--;
		return temp;
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertLast(20);
		list.insertFirst(5);
		list.insertFirst(10);
		list.insertLast(15);
		list.insertMiddle(0);
		list.insertMiddle(30);
		list.insertMiddle(35);

		list.printDL();
		System.out.println();
		System.out.println("Size is " + list.length());
	}
}
