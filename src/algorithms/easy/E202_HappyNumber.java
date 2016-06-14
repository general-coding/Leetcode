package algorithms.easy;

import java.util.HashSet;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/happy-number/
 * 
 *         Write an algorithm to determine if a number is "happy".
 * 
 *         A happy number is a number defined by the following process: Starting
 *         with any positive integer, replace the number by the sum of the
 *         squares of its digits, and repeat the process until the number equals
 *         1 (where it will stay), or it loops endlessly in a cycle which does
 *         not include 1. Those numbers for which this process ends in 1 are
 *         happy numbers.
 * 
 *         Example: 19 is a happy number 1. 1 pow 2 + 9 pow 2 = 82 2. 8 pow 2 +
 *         2 pow 2 = 68 3. 6 pow 2 + 8 pow 2 = 100 4. 1 pow 2 + 0 pow 2 + 0 pow
 *         2 = 1
 *
 */

public class E202_HappyNumber {

	public boolean isHappy(int n) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		int sum = 0;

		while (!hashSet.contains(sum)) {
			hashSet.add(sum);
			sum = 0;
			while (n > 0) {
				sum = (int) (sum + Math.pow(n % 10, 2));
				n = n / 10;
			}
			System.out.println(sum);

			if (sum == 1) {
				return true;
			}

			n = sum;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(new E202_HappyNumber().isHappy(2));
	}

}
