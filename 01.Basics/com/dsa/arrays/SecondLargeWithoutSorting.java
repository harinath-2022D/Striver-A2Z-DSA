package com.dsa.arrays;

public class SecondLargeWithoutSorting {

	public static void main(String[] args) {
		int[] arr = {32, 1, 21, 2, 2, 3};
		
		System.out.println(print2largest(arr));

	}
	
    public static int print2largest(int[] arr) {
        int firstLarge = -1;
        int secondLarge = firstLarge;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstLarge){
                secondLarge = firstLarge;
                firstLarge = arr[i];
            }else if(arr[i] > secondLarge && arr[i] < firstLarge){
                secondLarge =  arr[i];
            }
        }
        
        return secondLarge;
    }

}
