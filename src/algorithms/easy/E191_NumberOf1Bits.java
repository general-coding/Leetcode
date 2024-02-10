package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/number-of-1-bits/
 * 
 *         Write a function that takes an unsigned integer and returns the
 *         number of ’1' bits it has (also known as the Hamming weight).
 * 
 *         For example, the 32-bit integer ’11' has binary representation
 *         00000000000000000000000000001011, so the function should return 3.
 *
 */

public class E191_NumberOf1Bits {

	public int hammingWeight(int n) {
	        int res = 0;
	        while(n != 0){
	            res = res + (n & 1);
	            n = n >>> 1;
	        }
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new E191_NumberOf1Bits().hammingWeight(32767));
	}

}
