package com.dsa.arrays;

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
public class CheckArrayIsSortedAndRotated {

	public static void main(String[] args) {
		
		int[] arr = {3, 4, 5, 1, 2};
		System.out.println(check(arr));
	}

	public static boolean check(int[] arr) {
		int n = arr.length;
		int count = 0;

		for (int i = 1; i < n; i++) {
			if (arr[i - 1] > arr[i]) {
				count++;
			}
		}

		if (arr[n - 1] > arr[0] && count == 1)
			return false;
		return count <= 1;
	}

}
