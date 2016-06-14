package algorithms.easy;

/**
 * @author Puneeth U Bharadwaj
 * 
 *         https://leetcode.com/problems/climbing-stairs/
 * 
 *         You are climbing a stair case. It takes n steps to reach to the top.
 * 
 *         Each time you can either climb 1 or 2 steps. In how many distinct
 *         ways can you climb to the top?
 *
 */

public class E070_ClimbingStairs {

	public int climbStairs(int n) {
		if (n <= 2) {
			return n;
		}

		int ways = climbStairs(n - 1) + climbStairs(n - 2);

		return ways;
	}

	public int climbStairs2(int n) {
		if (n < 3) {
			return n;
		}
		int step1 = 1;
		int step2 = 2;
		for (int i = 3; i <= n; i++) {
			step2 = step1 + step2;
			step1 = step2 - step1;
		}
		return step2;
	}

	public static void main(String[] args) {
		System.out.println(new E070_ClimbingStairs().climbStairs(4));
	}

}
