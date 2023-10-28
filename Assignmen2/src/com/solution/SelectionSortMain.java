package com.solution;

import java.util.Arrays;

public class SelectionSortMain {

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		int comparisons = 0;
		for (int i = 0; i <= n - 2; i++) {
			for (int j = i + 1; j < n; j++) {
				comparisons++;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Total Comparisons : " + comparisons);
	}

	public static void main(String[] args) {

		int arr[] = { 8, 6, 2, 5, 1 ,15};
		System.out.println("Before Sorting : ");
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		selectionSort(arr);
		
		System.out.println();
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));
	}

}
