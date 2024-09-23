package com.dsa.arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = {0,0, 1, 1, 1, 2, 2};
		System.out.println("unique elements :" + removeDuplicates(nums));

	}

	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return 1;

		int k = 1;

		for (int i = 1; i < n; i++) {
			if (nums[i - 1] == nums[i]) {
				continue;
			} else {
				nums[k++] = nums[i];
			}
		}
		System.out.println(k);
		return k;
	}

}
