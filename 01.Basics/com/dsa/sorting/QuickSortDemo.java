package com.dsa.sorting;

public class QuickSortDemo {

	public static void main(String[] args) {
		int[] arr = {34, 12, 8 ,9, 1};
		quickSort(arr,0,4);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	/*
	 * step 1 : select the pivot element
	 * step 2 : insert pivot element into its correct position
	 * 
	 *  --> smaller on the left and greater on the right
	 *  
	 * while doing the task of inserting pivot element at its correct 
	 * position we can observe one thing that all the left elements in
	 * the array to the pivot elements are lesser and all right elements 
	 * to the pivot will be greater
	 * 
	 * pivot element can be : start element of array
	 *                        end element of array
	 *                        mid element of array
	 *                        random element of array
	 * */
	private static void quickSort(int[] arr, int low, int high) {
		
		if(low >= high) {
			return;
		}
		
		int pivot = findPartition(arr, low, high);
		
		quickSort(arr, low, pivot - 1);
		quickSort(arr, pivot + 1, high);
	}

	private static int findPartition(int[] arr, int low, int high) {
		
		int pivot = arr[low];
		
		int i = low;
		int j = high;
		
		while(i < j) {
			while(arr[low] <= pivot && i < high) {
				i++;
			}
			while(arr[high] >= pivot && j > low) {
				j--;
			}
			
			if( i < j) {
				swap(arr, i, j);
			}
		}
		
		swap(arr, low, j);
		
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
