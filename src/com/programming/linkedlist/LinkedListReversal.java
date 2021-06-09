package com.programming.linkedlist;

public class LinkedListReversal {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node linkedListReversal(Node n) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		n = prev;
		return n;
	}

	void printList(Node n) {
		while(n != null){
		System.out.println(n.data + "");
		n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListReversal rList = new LinkedListReversal();
		rList.head = new Node(1);
		rList.head.next = new Node(2);
		rList.head.next.next = new Node(3);
		System.out.println("LinkedList: ");
		rList.printList(head);
		System.out.println("Reverse of LinkedList: ");
		head = rList.linkedListReversal(head);
		rList.printList(head);
	}
}
