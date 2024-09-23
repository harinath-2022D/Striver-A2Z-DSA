package com.dsa.arrays;

public class LeftRotateArray {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		if (n == 1)
			return;

		swap(nums, 0, n - k - 1);
		swap(nums, n - k, n - 1);
		swap(nums, 0, n - 1);
	}

	public static void swap(int[] nums, int start, int end) {

		while (start < end) {
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;

			start++;
			end--;
		}
	}

}
