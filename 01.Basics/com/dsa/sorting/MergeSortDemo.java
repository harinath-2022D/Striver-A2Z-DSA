package com.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortDemo {

	public static void main(String[] args) {
		int[] arr = {34, 12, 8 ,9, 1};
		int[] arr2 = {23, 2, 1};
		
		mergeSort(arr, 0, 4);
		mergeSort(arr2, 0, 2);
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
		int[] res = new int[8];
		
		mergeTwoArrays(Arrays.stream(arr).boxed().toList(), Arrays.stream(arr2).boxed().toList(), res, 0);
		
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	private static void mergeSort(int[] arr,int start, int end) {
		
		if(start >= end) {
			return;
		}
		
		int mid = (start + end)/ 2;
		
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);
		
		merge(arr, start, mid, end);
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		
		ArrayList<Integer> firstList = new ArrayList<>();
		ArrayList<Integer> secondList = new ArrayList<>();
		
		for(int i = start; i<=mid; i++) {
			firstList.add(arr[i]);
		}
		
		for(int i = mid+1; i<=end; i++) {
			secondList.add(arr[i]);
		}
		
		mergeTwoArrays(firstList, secondList, arr, start);
	}
	
	private static void mergeTwoArrays(List<Integer> firstList, List<Integer> secondList,int[] arr, int start) {
		int point1 = 0;
		int point2 = 0;
		
		ArrayList<Integer> finalList = new ArrayList<>();
		
		while(point1 < firstList.size() && point2 < secondList.size()) {
			if(firstList.get(point1) < secondList.get(point2)) {
				finalList.add(firstList.get(point1));
				point1++;
			}else {
				finalList.add(secondList.get(point2));
				point2++;
			}
		}
		
		while(point1 < firstList.size()) {
			finalList.add(firstList.get(point1++));
		}
		
		while(point2 < secondList.size()) {
			finalList.add(secondList.get(point2));
		}
		
		int point3 = start;
		
		for(int i = 0; i < finalList.size(); i++) {
			arr[point3++] = finalList.get(i);
		}
	}

}
