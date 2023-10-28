package com.solution;

import java.util.Arrays;

public class BubbleSortMain {

	// NORMAL
	public static void bubbleSort(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// Efficient
	public static void bubbleSort2(int arr[], int n) {
		int pass = 0, comparisons = 0;
		for (int i = 0; i < n; i++) {
			pass++;
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				comparisons++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}

		System.out.println("Passes : " + pass);
		System.out.println("Comparisons : " + comparisons);
	}

	public static void main(String[] args) {

//		int arr[] = { 2, 13, 4, 1, 3, 6, 28 };
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));

		bubbleSort2(arr, arr.length);

		System.out.println(Arrays.toString(arr));
	}

}
