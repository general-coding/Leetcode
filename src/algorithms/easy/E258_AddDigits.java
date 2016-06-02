package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/nim-game/
 *
 *         Given a non-negative integer num, repeatedly add all its digits until
 *         the result has only one digit.
 * 
 *         For example: Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 =
 *         2. Since 2 has only one digit, return it.
 * 
 *         Follow up: Could you do it without any loop/recursion in O(1)
 *         runtime?
 * 
 */

public class E258_AddDigits {
	public int addDigits(int num) {
		if (num == 0) {
			return 0;
		} else if (num <= 9) {
			return num;
		} else {
			return 1 + ((num - 1) % 9);
		}
	}

	public static void main(String args[]) {
		System.out.println(new E258_AddDigits().addDigits(0));
	}
}
