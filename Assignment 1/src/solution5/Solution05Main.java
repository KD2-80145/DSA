package com.sunbeam;

public class Solution05Main {

	public static void findNonRepeating(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.println("First Non-Repeating : " + arr[i]);
				return;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		findNonRepeating(arr);
	}

}
