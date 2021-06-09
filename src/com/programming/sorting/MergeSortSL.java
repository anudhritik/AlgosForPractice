package com.programming.sorting;

public class MergeSortSL {
	public class Node{
		Node next;
		int data;
	}
	Node head;

	Node sortedMerge(Node a, Node b) {
		Node result = null;
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}
		if (a.data <= b.data) {
			result = a;
			result.next = sortedMerge(a.next, b);
		} else {
			result = b;
			result.next = sortedMerge(a, b.next);
		}
		return result;
	}

	Node mergeSort(Node head) {
		// base case
		if (head == null || head.next == null) {
			return head;
		}
		Node middle = findMiddle(head);
		Node nextToMiddle = middle.next;
		middle.next = null;

		Node left = mergeSort(head);
		Node right = mergeSort(nextToMiddle);

		Node sortedList = sortedMerge(left, right);
		return sortedList;
	}

	public static Node findMiddle(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

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
		MergeSortSL ll = new MergeSortSL();
		ll.insert(20);
		ll.insert(10);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);

		ll.head = ll.mergeSort(ll.head);
		ll.print();
	}

}
