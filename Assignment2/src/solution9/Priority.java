package solution9;

import java.util.Scanner;

public class Priority {

	public static int getPriority(String opr) {
		switch (opr) {
		case "+":
			return 1;
		case "-":
			return 1;
		case "*":
			return 2;
		case "/":
			return 2;
		case "$":
			return 3;
		case "%":
			return 3;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opr;
		int priority;
		System.out.println("Enter Operator to find priority :");
		opr = sc.next();
		priority = getPriority(opr);
		System.out.println("Priority of "+opr+" : " + priority);
	}

}
