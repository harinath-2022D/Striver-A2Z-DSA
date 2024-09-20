package com.dsa.arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int[] arr = {32, 1, 321, 2, 34, 2};
		
		System.out.println(largest(arr));

	}
	
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        return max;
    }

}
