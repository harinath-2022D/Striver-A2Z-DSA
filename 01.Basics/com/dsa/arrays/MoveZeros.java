package com.dsa.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 0 };
		moveZeroes(nums);
		
		Arrays.stream(nums).forEach(System.out::println);
	}

	public static void moveZeroes(int[] nums) {
		int n = nums.length;
		int[] copy = new int[n];

		int i = 0;
		int j = 0;

		while (i < n) {
			if (nums[i] != 0) {
				copy[j++] = nums[i];
			}
			i++;
		}

		i = 0;

		while (i < n) {
			nums[i] = copy[i];
			i++;
		}
	}

}
