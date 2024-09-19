package com.dsa.sorting;

/*
 * keep in mind -> Bubble sort means adjacent swap of two elements
 * if we do that for every iteration end of the element automatically sorted
 * */
public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] arr = { 34, 12, 8, 9, 1 };
		
		bubbleSort(arr, 5);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void bubbleSort(int[] arr, int n) {
		
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j + 1]) {
					SelectionSortDemo.swap(arr, j, j+1);
				}
			}
		}
	}

	

}
