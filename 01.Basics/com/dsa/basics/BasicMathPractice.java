package com.dsa.basics;

public class BasicMathPractice {

	public static void main(String[] args) {
//		evenlyDivides(22074);
//		reverse(-123);
		System.out.println(checkPrime(4));
	}
	
	/*
	 * https://www.geeksforgeeks.org/problems/count-digits5716/1
	 * */
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
    
    /*
     * https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
     * */
    static Long[] lcmAndGcd(Long A , Long B) {
        Long[] ans = new Long[2];
        
        long gcd = findGcd(A, B);
        long prod = A * B;
        long lcm = prod / gcd;
        ans[0] = lcm;
        ans[1] = gcd;
        return ans;
    }
    
    static long findGcd(long a, long b){
        if( a == 0){
            return b;
        }
        
        return findGcd(b%a,a);
    }
    
    /*
     * https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
     * */
    static long sumOfDivisors(int N){
        long sum = 0;
       for(int i = 1; i <= N; i++){
        //   sum += findDivisors(i);
        sum += i * (N / i);
       }
       return sum;
    }
    
    static long findDivisors(int val){
        long sum = 0;
        for(int i = 1; i<= val; i++){
            if(val % i == 0){
               sum += i;
            }
        }
        return sum;
    }
    
    static boolean checkPrime(int n) {
    	int cnt = 0;
    	
    	for(int i = 1; i * i <= n; i++) {
    		if(n % i == 0) {
    			cnt = cnt + 1;
    			if(n / i != i) {
    				cnt++;
    			}
    		}
    	}
    	
    	if(cnt == 2) {
    		return true;
    	}
    	
    	return false;
    }
}
