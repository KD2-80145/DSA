package com.solution.q7;

public class Queue {

	private int arr[];
	private int front;
	private int rear;

	public Queue(int size) {
		arr = new int[size];
		front = 0;
		rear = 0;
	}

	public void enqueue(int e) {
		if (!isFull()) {
			arr[rear] = e;
			rear++;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty.");
			return -1;
		}
		return arr[front++];
	}

	public boolean isFull() {
		return (rear == arr.length);
	}

	public boolean isEmpty() {
		return (front == rear);
	}

}
