package solution7;

public class LinearQueue {

	private int front;
	private int rear;
	private final int SIZE;
	private int arr[];

	public LinearQueue(int n) {
		front = 0;
		rear = 0;
		SIZE = n;
		arr = new int[SIZE];
	}

	public boolean isEmpty() {
		return front ==rear;
	}

	public boolean isFull() {
		return rear == SIZE ;
	}

	public void enqueue(int val) {
		if (isFull()) {
			System.out.println("Queue is Full.");
			return;
		}
		arr[rear] = val;
		rear++;
	}

	public int getFront() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		return arr[front];
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int data = arr[front];
		front++;
		return data;
	}

}
