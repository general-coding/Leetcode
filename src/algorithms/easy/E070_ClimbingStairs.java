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
		if (n == 1) 
	        {
	            return 1;
	        }
	        int first = 1;
	        int second = 2;
	        int output = second;
	        for (int i = 3; i <= n; i++) 
	        {
	            output = first + second;
	            first = second;
	            second = output;
	        }
	        return output;
	}

	public static void main(String[] args) {
		System.out.println(new E070_ClimbingStairs().climbStairs(4));
	}

}
