package com.Searching;

public class BinarySearchRec {

	public static int BinarySearchRecSol(int arr[], int key, int left, int right) {
		if (left > right) {
			return -1;
		}

		int mid = (left + right) / 2;
		if (key > arr[mid])
			return BinarySearchRecSol(arr, key, mid + 1, right);
		else if (key < arr[mid])
			return BinarySearchRecSol(arr, key, left, mid - 1);
		else
			return mid;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 10, 22 };
		int key = 10;
		int idx = BinarySearchRecSol(arr, key, 0, arr.length - 1);
		System.out.println(idx);

	}

}
