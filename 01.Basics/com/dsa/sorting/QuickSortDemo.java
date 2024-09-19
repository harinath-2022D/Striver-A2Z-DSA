package com.dsa.sorting;

public class QuickSortDemo {

	public static void main(String[] args) {
		int[] arr = {34, 12, 8 ,9, 1};
		quickSort(arr,0,4);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

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
