package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/power-of-two/
 * 
 *         Given an integer, write a function to determine if it is a power of
 *         two.
 *
 */

public class E231_PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		System.out.println(Integer.toBinaryString(n));
		if ((n > 0) && ((n & (n - 1)) == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(new E231_PowerOfTwo().isPowerOfTwo(-2147483648));
	}

}
