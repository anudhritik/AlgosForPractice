package com.programming.linkedlist;

public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if (head == null || left == right)
			return head;

		ListNode dummy = new ListNode(0);
		dummy.next = head;

		// This is the node right before the sublist that needs to be reversed.
		ListNode nodeBeforeSubList = dummy;

		int pos = 1;
		// Need to keep incrementing the nodeBeforeSublist until the actual
		// sublist that needs to be reversed.
		
		while (pos < left) {
			nodeBeforeSubList = nodeBeforeSubList.next;
			pos++;
		}

		ListNode workingPointer = nodeBeforeSubList.next;
		while (left < right) {
			// cutting the new node out.
			ListNode nodeToBeExtracted = workingPointer.next;
			workingPointer.next = nodeToBeExtracted.next;

			// Pasting it infront.
			nodeToBeExtracted.next = nodeBeforeSubList.next;
			nodeBeforeSubList.next = nodeToBeExtracted;

			left++;
		}

		return dummy.next;
	}
}
