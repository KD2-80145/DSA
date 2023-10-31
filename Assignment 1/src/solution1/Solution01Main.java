package com.sunbeam;

import java.util.Arrays;

public class Solution01Main {

	public static int linearSearchComparisons(int arr[], int key) {

		int comparisons = 0;
		for (int i = 0; i < arr.length; i++) {
			comparisons++;
			if (arr[i] == key) {
				return comparisons;
			}
		}

		return arr.length;
	}

	public static int binarySearchComparisons(int arr[], int key) {
		int comparisons = 0;

		int leftIdx = 0, rightidx = arr.length - 1;// valid array
		int mid;

		while (leftIdx <= rightidx) {
			mid = (leftIdx + rightidx) / 2;

			if (key < arr[mid]) {
				rightidx = mid - 1;
			} else if (key > arr[mid]) {
				leftIdx = mid + 1;
			} else {
				System.out.println(key + " found at index : " + mid);
				comparisons++;
				return comparisons;
			}

			comparisons++;

		}

		return comparisons;

	}

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55, 66 };

		int key = 55;

		/*
		 * int comparisons = linearSearchComparisons(arr, key);
		 * 
		 * System.out.println("No of Comparisons in Linear Search : " + comparisons);
		 */

		Arrays.sort(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();
		int comparisons = binarySearchComparisons(arr, key);

		System.out.println("No of Comparisons in Binary Search : " + comparisons);

	}

}
