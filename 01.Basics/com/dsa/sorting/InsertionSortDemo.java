package com.dsa.sorting;

/*
 * keep in mind -> in insertion sort always look at the left element 
 * if left element is greater than current element
 * then swap the element with left until next smaller found
 * 
 * time complexity -> worst case : O(N)^2
 *                    best case : O(N)
 * 
 * */
public class InsertionSortDemo {

	public static void main(String[] args) {
		int[] arr = {34, 12, 8 ,9, 1};
		insertionSort(arr,5);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void insertionSort(int[] arr, int n) {
		
		for(int i = 0; i < n; i++) {
			int j = i;
			
			while( j > 0 && arr[j-1] > arr[j]) {
				SelectionSortDemo.swap(arr, j, j-1);
				j--;
			}
		}
	}

}
