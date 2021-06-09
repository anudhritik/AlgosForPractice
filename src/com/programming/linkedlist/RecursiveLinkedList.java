package com.programming.linkedlist;

public class RecursiveLinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void printList(Node n) {
		while (n != null) {
			System.out.println(n.data + "");
			n = n.next;
		}
	}

	Node reverse(Node head) {
		if (head == null) {
			return null;
		} else if (head.next == null) {
			return head;
		} else {
			Node nextNode = head.next;
			head.next = null;
			Node rest = reverse(nextNode);
			nextNode.next = head;
			return rest;
		}
	}

	public static void main(String[] args) {
		RecursiveLinkedList rList = new RecursiveLinkedList();
		rList.head = new Node(1);
		rList.head.next = new Node(2);
		rList.head.next.next = new Node(3);
		System.out.println("LinkedList: ");
		rList.printList(head);
		System.out.println("Reversed LinkedList: ");
		rList.printList(rList.reverse(head));
	}
}
