package com.sunbeam;

public class Solution03Main {

	public static int binarySearchDesc(int arr[], int key) {

		int leftIdx = 0, rightIdx = arr.length - 1;
		int mid;

		while (leftIdx <= rightIdx) {
			mid = (leftIdx + rightIdx) / 2;

			if (key > arr[mid]) {
				rightIdx = mid - 1;
			} else if (key < arr[mid]) {
				leftIdx = mid + 1;
			} else {
				return mid;
			}

		}
		
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 6, 5, 4, 3, 2, 1 };

		int key = 6;

		int ans=binarySearchDesc(arr, key);
		
		System.out.println(ans);
	}

}
