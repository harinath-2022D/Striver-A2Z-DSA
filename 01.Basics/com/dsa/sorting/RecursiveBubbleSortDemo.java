package com.dsa.sorting;

public class RecursiveBubbleSortDemo {

	public static void main(String[] args) {
		int[] arr = {34, 12, 8 ,9, 1};
		
		RecursiveBubbleSort(arr,5);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void RecursiveBubbleSort(int[] arr, int n) {
		
		if(n == 1) return;
		
		for(int j = 0; j < n-1; j++) {
			if(arr[j] > arr[j+1]) {
				int temp =  arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		RecursiveBubbleSort(arr, n-1);
	}

}
