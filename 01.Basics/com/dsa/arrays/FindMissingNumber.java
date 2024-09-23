package com.dsa.arrays;

// https://leetcode.com/problems/missing-number/
public class FindMissingNumber {

	public static void main(String[] args) {
		int[] nums = {0, 1};
		System.out.println(missingNumber(nums));

	}

	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int[] freq = new int[n + 1];
		int ans = -1;

		for (int i = 0; i < n; i++) {
			freq[nums[i]]++;
		}

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 0)
				ans = i;
		}

		return ans;
	}

}
