package com.dsa.basics;

public class BasicRecursion {

	public static void main(String[] args) {
//		System.out.println(sumOfSeries(5));
//		isPalindrome("A man, a plan, a canal: Panama");
		int[] freq = new int[5];
		
	}
	
	// https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
    static long sumOfSeries(long n) {
        
        if(n == 1) return 1;
        return (n * n * n) + sumOfSeries(n - 1);
    }
    
    // https://leetcode.com/problems/valid-palindrome/
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)) {
            	sb.append(Character.toLowerCase(ch));
            }
        }

        System.out.println(sb);
        int left = 0;
        int right = sb.length() - 1;

        while(left < right){
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    
    // https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
    public static void frequencyCount(int arr[], int N, int P) {
        int[] freq = new int[P];
        
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            freq[num - 1]++;
        }
        
        for(int i = 0; i < P && i < N; i++){
            arr[i] = freq[i];
        }
        
        int pnt =P;
        while(pnt < N){
            arr[pnt] = 0;
            pnt++;
        }
    }

}
