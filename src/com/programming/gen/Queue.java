package com.programming.gen;

public class Queue {
	int arr[] = new int[5];
	int front, rear, size;

	public void enqueue(int data) {
		arr[rear++] = data;
		size++;
	}

	public int dequeue() {
		int data = arr[front];
		front++;
		size--;
		return data;
	}

	public int getSize() {
		return size;
	}

	public void print() {
		for (int i = front; i < rear; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(2);
		queue.enqueue(5);
		queue.print();
		queue.dequeue();
	}
}
