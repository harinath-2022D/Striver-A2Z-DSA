package com.dsa.arrays;

import java.util.HashMap;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1, 2, 2, 3, 4, 4, 3};
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		int res = -1;

		for (int i = 0; i < nums.length; i++) {
			mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
		}

		for (int key : mp.keySet()) {
			if (mp.get(key) == 1) {
				res = key;
				break;
			}
		}

		return res;
	}

}
