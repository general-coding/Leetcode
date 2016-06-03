package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/power-of-three/
 * 
 *         Given an integer, write a function to determine if it is a power of
 *         three.
 *
 */

public class E326_PowerOfThree {

	public boolean isPowerOfTwo(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}

	public static void main(String[] args) {
		System.out.println(new E326_PowerOfThree().isPowerOfTwo(81));
	}

}
