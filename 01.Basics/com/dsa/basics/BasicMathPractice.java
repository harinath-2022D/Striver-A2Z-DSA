package com.dsa.basics;

public class BasicMathPractice {

	public static void main(String[] args) {
//		evenlyDivides(22074);
		int n = -42;
		System.out.println(n - n * 2);
	}
	
    static int evenlyDivides(int N){
        
        int count = 0;
        
        int temp = N;
        while (temp > 0){
            int digit = temp % 10;
            if(digit != 0 && N % digit == 0) count++;
            temp = temp / 10;
        }
        
        return count;
    }
    
    /*
     * https://leetcode.com/problems/reverse-integer/
     * 
     * */
    public static int reverse(int x) {
        int temp = Math.abs(x);

        long ans = 0;

        while( temp != 0){
            int digit = temp % 10;
            ans = ans * 10 + digit;
            temp = temp / 10;
        }

        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }

        if(x < 0) return (int) (-1 * ans);
        return (int) ans;
    }

}
