package com.dsa.arrays;

// https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win
public class SearchInSortedArray {

	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 5, 6};
		int n = 5;
		int k = 6;
		
		System.out.println(searchInSorted(nums, n, k));
	}

	public static int searchInSorted(int arr[], int n, int k) {

		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == k)
				return 1;
			else if (arr[mid] < k) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;
	}

}
