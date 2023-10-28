package com.solution;

import java.util.Arrays;

public class InsertionSortMain {

	// NORMAL
	public static void insertionSort(int arr[]) {
		int n = arr.length;
		int comparisons = 0;
		for (int i = 0; i < n - 1; i++) {
			int temp = arr[i + 1];
			int j = i;

			while (j >= 0) {
				comparisons++;
				if (arr[j] > temp)
					arr[j + 1] = arr[j];

				j--;
			}
			arr[j + 1] = temp;

		}

		System.out.println("Total Comparisons : " + comparisons);

	}

	// EFFICIENT
	public static void insertionSort2(int arr[]) {
		int n = arr.length;
		int comparisons = 0;
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) {
				comparisons++;
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;

		}
		System.out.println("Total Comparisons : " + comparisons);

	}

	public static void main(String[] args) {

//		int arr[] = { 1, 2, 3, 4, 5 };
		int arr[]= {9,3,6,2,0};

		insertionSort2(arr);

		System.out.println(Arrays.toString(arr));
	}

}
