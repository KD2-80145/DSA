package solution7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinearQueue que = new LinearQueue(3);
		int choice;
		Scanner sc = new Scanner(System.in);
		int data;
		do {
			System.out.println("0. Exit\n1. Push\n2. Poll\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Data : ");
				data = sc.nextInt();
				que.enqueue(data);
				break;
			case 2:
				data = que.dequeue();
				if (data != -1)
					System.out.println("Data Polled : " + data);
				break;
			case 3:
				data = que.getFront();
				if (data != -1)
					System.out.println("Data Peeked : " + data);
				break;
			}
		} while (choice != 0);

		sc.close();
	}

}
