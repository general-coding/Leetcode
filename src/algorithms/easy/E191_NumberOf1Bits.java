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
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		int oneCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				oneCount++;
			}
		}

		return oneCount;
	}

	public static void main(String[] args) {
		System.out.println(new E191_NumberOf1Bits().hammingWeight(32767));
	}

}
