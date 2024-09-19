package com.dsa.sorting;

public class RecursiveInsertionSortDemo {

	public static void main(String[] args) {
		int[] arr = {34, 12, 8 ,9, 1};
		recursiveInsertionSort(arr, 0, 5);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void recursiveInsertionSort(int[] arr, int i, int n) {
		
		if( i == n) return;
		
		int j = i;
		
		while( j > 0 && arr[j-1] > arr[j]) {
			
			int temp = arr[j-1];
			arr[j-1] = arr[j];
			arr[j] = temp;
			
			j--;
		}
		
		recursiveInsertionSort(arr, i + 1, n);
		
	}

}
