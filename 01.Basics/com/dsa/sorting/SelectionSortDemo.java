package com.dsa.sorting;


/*
 * selection sort means select the minimum element and swap
 * */
public class SelectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34, 12, 8 ,9, 1};
		selectionSort(arr,5);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	private static void selectionSort(int[] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			int minIdx = i;
			
			for(int j = i; j <= n-1; j++) {
				
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			
			swap(arr, i, minIdx);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		
	}

}
