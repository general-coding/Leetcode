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
	        //fast and slow pointer method is used
	        int slow = n;
	        int fast = n;
	
	        do{
	    		slow = doSquareOfDigits(slow);
	            	fast = doSquareOfDigits(doSquareOfDigits(fast));
	        }while(slow != fast);
	
	        if(slow == 1) return true;
	        
	        return false;
	    }
	
	    public int doSquareOfDigits(int number){
	        int ans = 0;
	        while(number>0){
	    		int rem = number%10;
	            	ans += rem*rem;
	            	number = number/10;
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		System.out.println(new E202_HappyNumber().isHappy(2));
	}

}
