package com.sunbeam;

public class Solution04Main {

	public static int findNOccurance(int arr[], int key, int n) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				count++;
			if (count == n)
				return i;
		}
		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 2, 5, 6 };

		int key = 2;
		int occurance = 4;

		int ans = findNOccurance(arr, key, occurance);
		
		System.out.println(ans);

	}

}
