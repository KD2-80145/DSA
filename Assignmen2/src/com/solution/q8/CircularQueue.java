package com.solution.q8;

public class CircularQueue {
	private int arr[];
	private int rear, front;
	private final int SIZE;
	int counter;

	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
		counter = 0;
	}

	public void push(int data) {
		rear = (rear + 1) % SIZE;
		arr[rear] = data;
		counter++;
	}

	public void pop() {
		front = (front + 1) % SIZE;
		if (front == rear)
			front = rear = -1;
		counter--;
	}

	public int peek() {
		// a. read/return data of front + 1 index
		return arr[(front + 1) % SIZE];
	}

	public boolean isFull() {
		return (counter == SIZE - 1);
	}

	public boolean isEmpty() {
		return (counter == 0);
	}

}
