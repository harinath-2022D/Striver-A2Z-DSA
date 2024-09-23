package com.dsa.arrays;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
public class UnionOfSortedArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 1, 2, 3};
		int[] arr2 = {1, 2, 4};
		
		int n = 4;
		int m = 3;
		
		ArrayList<Integer> findUnion = findUnion(arr1, arr2, n, m);
		
		System.out.println(findUnion);
	}

	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
		ArrayList<Integer> res = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < n && j < m) {
			if (arr1[i] <= arr2[j]) {
				if (res.size() == 0 || res.get(res.size() - 1) != arr1[i])
					res.add(arr1[i]);

				i++;

			} else {
				if (res.size() == 0 || res.get(res.size() - 1) != arr2[j])
					res.add(arr2[j]);

				j++;
			}
		}

		while (i < n) {
			if (res.get(res.size() - 1) != arr1[i])
				res.add(arr1[i]);
			i++;
		}

		while (j < m) {
			if (res.get(res.size() - 1) != arr2[j])
				res.add(arr2[j]);
			j++;
		}

		return res;
	}
}
